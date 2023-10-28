package ovh.christophedlr;

import ovh.christophedlr.controller.Master;

import java.io.IOException;

public class JExosculatio {
    public static void main(String[] args) throws IOException {
        Master master = new Master();
        master.run();
    }
}
