package com.zz.common.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws IOException {
		FileInputStream stream = new FileInputStream("e:/test.txt");
	 String string = StreamUtil.readTextFile(stream);
	 System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() throws FileNotFoundException, IOException {
		String string = StreamUtil.readTextFile(new File("e:/test.txt"));
		System.out.println(string);
	}

}
