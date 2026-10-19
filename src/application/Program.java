package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do cliente: ");
        System.out.print("nome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(birthDate,email,nome);

        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();

        Order order = new Order(client,  new Date(), OrderStatus.valueOf(status));

        System.out.print("Quantos itens nesse pedido? ");
        int nPedidos = sc.nextInt();

        for (int i =1; i<=nPedidos; i++) {
            System.out.println("Entre com os dados do item #" + i + ": ");
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeDoProduto = sc.nextLine();
            System.out.print("Preço do produto: ");
            double precoDoProduto = sc.nextDouble();
            Product product = new Product(nomeDoProduto, precoDoProduto);
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();

            OrderItem orderItem = new OrderItem(precoDoProduto,product,quantidade);
            order.addItem(orderItem);
        }
        System.out.println(order);



        sc.close();
    }
}
