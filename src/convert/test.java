package convert;

import com.cloudcc.file.docstopdfconverter.ConvertUtil;

public class test {
	public static void main(String[] args){
		ConvertUtil cu = new ConvertUtil();
		try {
			
			cu.Convert("doc", "F:/Cloudcc产品开发实现设计-天眼查-V1.0-20180131.doc", null, false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
