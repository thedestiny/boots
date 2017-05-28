package com.acedata.boots.util.string;

import java.util.UUID;

public class StringUtils {

    public static String generateUUID(){

        UUID uuid = UUID.randomUUID();

        return uuid.toString();
    }


}
