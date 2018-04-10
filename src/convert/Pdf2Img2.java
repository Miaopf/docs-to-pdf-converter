package convert;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.cloudcc.file.docstopdfconverter.Pdf2Img;

public class Pdf2Img2 {

	public static void main(String[] args) throws Exception {
		String filePath = "F:/1.pdf";
		File inFile = new File(filePath);
		InputStream iStream = new FileInputStream(inFile);
        Pdf2Img pdf = new Pdf2Img();
        pdf.convert(iStream, "F:/1", false);
	}

}
