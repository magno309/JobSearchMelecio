package org.jobsearch;

import com.beust.jcommander.JCommander;
import java.util.function.Supplier;

public class CommanderFunctions {
    static <T> JCommander buildCommanderWithName(String cliname, Supplier<T> argumentSupplier){
        JCommander jCommander = JCommander
                .newBuilder()
                .addObject(argumentSupplier.get())
                .build();
        jCommander.setProgramName(cliname);
        return jCommander;
    }
            
}
