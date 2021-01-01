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


@WebServlet(urlPatterns = {"/UploadServlet"})
public class Upload3 extends HttpServlet {
	
        @Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
        {
	ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
     
        try
            {
                List<FileItem> multi=sf.parseRequest(request);
            
            for(FileItem item: multi)
            {
                item.write(new File("D:\\study\\java\\adv\\servelet and jsp1\\file\\" +item.getName()));
            }
            
              }
          catch(Exception e)
          {
              
          }
        }
}
