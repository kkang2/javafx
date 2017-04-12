package org.bigdata.util;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class FileUtil {
	
	public static Path createFile(Path pathObj) {
		Path newPathObj = null;
		
		try {
			newPathObj = Files.createFile(pathObj);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return newPathObj;
	}
	
	public static Path getPathObj(String path) {
		return FileSystems.getDefault().getPath(path);
	}
	
	public static boolean isFileExist(Path pathObj, boolean isSymbolicAllow) {
		boolean result = false;
		
		if(isSymbolicAllow) {
			result = Files.exists(pathObj);
		} else {
			result = Files.exists(pathObj, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
		}
		
		return result;
	}

	public static void main(String[] args) {

	}
}