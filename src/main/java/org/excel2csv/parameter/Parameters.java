package org.excel2csv.parameter;

import com.beust.jcommander.Parameter;
import java.io.File;

public class Parameters {
    @Parameter(
            names = {"-s", "--source"},
            description = "Source Excel file",
            validateWith = ParamSourceFileValidator.class,
            required = true
    )
    private String inputFile;

    @Parameter(
            names = {"-d", "--destination"},
            description = "Destination CSV file",
            validateWith = ParamDestinationFolderValidator.class,
            required = true
    )
    private String outputFile;

    @Parameter(names={"-h", "--help"},
            description="Help/Usage",
            help=true)
    private boolean help;

    public String getInputFile() {
        return inputFile;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public boolean isHelp() {
        return help;
    }
}
