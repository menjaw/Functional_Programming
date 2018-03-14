/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import controller.ClientHandler;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Menja
 */
public class Server_TCP {

    //Variables
    public static int PORT = 8081;
    public static String IP = "127.0.0.1";
    public static boolean listen = true;

    //Opret instans af serveren
    public static void main(String[] args) throws IOException {
        System.out.println("The server is startet and is listening");
        new Server_TCP().listenForClients();//Server opretter en instans af sig selv og kalder på lytte-metoden
    }

    /*METHODS*/
    /**
     * ServerSocket afventer requests fra netværket.
     *
     * ServerSocket-metoden opretter en ubunden server socket.
     *
     * Bind-metoden binder serverSocket til en bestemt IP-adresse og Port-nummer
     *
     * InetSocketAddress giver et uforanderlig objekt det anvendes af sockets
     * til binding, connections eller returned values
     *
     * Socket er et endpoint for kommunikationen mellem to maskiner (client,
     * server)
     *
     * accept()-metoden lytter efter connections der laves til denne socket og
     * accepterer (Socket blokerer indtil der er lavet en connection)
     *
     * @throws IOException
     */
    public void listenForClients() throws IOException {
        //Creates an unbound server 
        ServerSocket serverSocket = new ServerSocket();
        
        //Binds serverSocket to specific IP and Port
        serverSocket.bind(new InetSocketAddress(IP, PORT));

        //Lytter efter clients
        while (listen) {

            Socket socket = serverSocket.accept();

            //ClientHandler lytter efter input fra clients 
            new ClientHandler(socket, this);
        }
    }
}
