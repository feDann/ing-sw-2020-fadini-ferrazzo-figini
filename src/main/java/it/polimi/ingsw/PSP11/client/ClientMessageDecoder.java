package it.polimi.ingsw.PSP11.client;

import it.polimi.ingsw.PSP11.messages.*;

import java.util.Scanner;

public class ClientMessageDecoder {


    public static void decodeMessage(Message message) {

        if (message instanceof SimpleMessage) {
            //actually calls view methods to show messages
            String messaggino = message.getMessage();
            System.out.print(messaggino);
        }


    }


}
