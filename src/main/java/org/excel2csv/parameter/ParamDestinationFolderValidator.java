package org.excel2csv.parameter;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.io.File;

public class ParamDestinationFolderValidator  implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        var destinationFile = new File(value);
        var parentDir = destinationFile.getParentFile();
        if(!isParamFileFolderValid(parentDir)){
            throw new ParameterException("The destination " + parentDir + " for the CSV file cannot be found.");
        }
    }

    private boolean isParamFileFolderValid(File destinationFile){
        return destinationFile.isDirectory();
    }
}