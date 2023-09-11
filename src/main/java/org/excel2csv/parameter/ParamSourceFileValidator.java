package org.excel2csv.parameter;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

import java.io.File;

public class ParamSourceFileValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        var sourceFile = new File(value);
        if(!isParamFileValid(sourceFile)){
            throw new ParameterException("The source Excel file cannot be found at " + sourceFile);
        }
    }

    private boolean isParamFileValid(File sourceFile){
        return sourceFile.exists();
    }
}
