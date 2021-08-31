package com.automationdirect.sniffshell;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecShellCommand {
	
	public static String executeCommand(String cmd) {
		final StringBuffer output = new StringBuffer();
        try {
            final Process p = Runtime.getRuntime().exec(cmd);
            p.waitFor();
            final BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                output.append(String.valueOf(line) + "\n");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return output.toString();		
	}
	
}
