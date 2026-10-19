package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> orderItemList = new ArrayList<>();
    private Client client;

    public Order(){
    }

    public Order(Client client, Date moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    public void addItem(OrderItem orderItem){
        orderItemList.add(orderItem);
    }
    public void removeItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }

    public double Total(){
        double sum = 0;
        for (OrderItem o : orderItemList){
            sum += orderItemList.getFirst().subTotal();
        }
        return sum;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Resumo do pedido: \n" );
        sb.append("Data do pedido: " + sdf.format(moment) + "\n");
        sb.append("Status do pedido: " + status + "\n");
        sb.append("Cliente: \n");
        sb.append(client.getName() + " - ");
        sb.append(client.getEmail() + "\n");
        sb.append("Itens do pedido: \n");
        for (OrderItem item : orderItemList){
            sb.append(item + "\n");
        }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", Total()));
        return sb.toString();

    }
}
