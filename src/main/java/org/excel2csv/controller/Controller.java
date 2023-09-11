package org.excel2csv.controller;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import org.excel2csv.parameter.Parameters;

public class Controller {
    public static void start(String[] args){
        var params = new Parameters();
        var cmd = JCommander.newBuilder()
                .addObject(params)
                .build();

        try {
            cmd.parse(args);
        } catch (ParameterException e){
            System.err.println(e.getLocalizedMessage());
            cmd.usage();
        }

        if(!params.isHelp()){
            System.out.println(params.getInputFile());
            System.out.println(params.getOutputFile());
        }else cmd.usage();
    }
}
