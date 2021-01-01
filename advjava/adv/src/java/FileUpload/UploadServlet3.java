package FileUpload;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet(urlPatterns = {"/Upload3"})
public class UploadServlet3 extends HttpServlet {
	
        @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
        {
	ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
           sf.setFileSizeMax(1000*1000*1000);//setting the maximum size of file
            // sf.setSizeMax(0);//maximum size of memory
            
          try{
                List<FileItem> multi=sf.parseRequest(request);
           // multi.isEmpty();//to check file is there or not
           //OR
          // boolean ismultipart=ServletFileUpload.isMultipartContent(request);
          //Return weather the file is given or not
          for(FileItem item: multi)
            {
              String type=  item.getContentType();//1.audio/mpeg//By this we can set type content
//2.image/jpeg
//3.image/png
//to get size
//long a=item.getSize();//return type long

System.out.println(type);
                item.write(new File("D:\\study\\java\\adv\\servelet and jsp1\\file\\" +item.getName()));
            }
                }
          catch(Exception e)
          {
              
          }

        }
}
