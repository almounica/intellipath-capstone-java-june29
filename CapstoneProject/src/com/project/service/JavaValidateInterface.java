package com.project.service;
import java.io.File;
import java.io.IOException;

import com.project.exceptions.FileNameException;
import com.project.exceptions.NameSyntaxException;
import com.project.exceptions.ParenthesesException;

public interface JavaValidateInterface {
	   void checkParantheses(String s) throws ParenthesesException;
	   void checkClassName(String word) throws NameSyntaxException;
	   void CheckFileName(String string, File file) throws FileNameException;
	   void writefile(File file, String words) throws IOException;
}
