import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.nio.file.FileSystemException;
import java.nio.file.Files;



public class FileExtension {
// return true or false acooding to a file extension
    public boolean check(String filename){
//Checking the suffix of the file
        if (filename.endsWith(".java")) {
            System.out.print(true);
            //return true;
        } else {
            System.err.print(false);
            //retun false;
        }
    }


// map method to check file extension and map returned value
    Map<String, int> FileExtension(List<String> filenames){
        /* 
    if (filenames.getFileExtension(".java")) {
        return 1;
     } if (filenames.getFileExtension(".")) {
        return 0;
     } else if (filenames.getFileExtension == null){
        return -1;
     } 
        */

    // Call the map function
       Map<String, int> result = mapFilename(filenames);{
      
    // Print the resulting map
        print(result);

     try {
        if (filenames == null) {
          // If the filename is null, map it to -1
          filenameMap[filenames] = -1;
        } else {
          // Extract the extension from the filename
          String extension = getFileExtension(filenames);
  
          if (extension == null) {
            // If there's no extension, decide how to handle it
            // For this example, we'll map filenames without an extension to 0
            filenamesMap[filenames] = 0;
          } else if (extension.toLowerCase() == ".java") {
            // If the extension is '.java', map to 1
            filenamesMap[filenames] = 1;
          } else {
            // For all other extensions, map to 0
            filenamesMap[filenames] = 0;
          }
        }
      } catch (FileSystemException e) {
        // In case of any unexpected exceptions, map to -1
        filenamesMap[filenames] = -1;
      }
    return filenamesMap;}
    }
    
    
    /* 
      /// This function takes a list of filenames and returns a map where:
      /// - Filenames with a '.java' extension are mapped to 1.
      /// - Filenames with other extensions are mapped to 0.
      /// - Null filenames or any exceptions during processing are mapped to -1.
      Map<String, int> mapFilenames(List<String> filenames) {
        // Initialize an empty map with nullable String keys
        Map<String, int> filenameMap = {};
      
        for (String filename in filenames) {
          try {
            if (filename == null) {
              // If the filename is null, map it to -1
              filenameMap[filename] = -1;
            } else {
              // Extract the extension from the filename
              String extension = _getFileExtension(filename);
      
              if (extension == null) {
                // If there's no extension, decide how to handle it
                // For this example, we'll map filenames without an extension to 0
                filenameMap[filename] = 0;
              } else if (extension.toLowerCase() == '.java') {
                // If the extension is '.java', map to 1
                filenameMap[filename] = 1;
              } else {
                // For all other extensions, map to 0
                filenameMap[filename] = 0;
              }
            }
          } catch (e) {
            // In case of any unexpected exceptions, map to -1
            filenameMap[filename] = -1;
          }
        }
      
        return filenameMap;
      }
      */

    // Helper function to extract the file extension from a filename.
    // Returns the extension including the dot (e.g., '.java') or null if none exists.
      String getFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
    
        // If there's no dot or it's the first character, there's no valid extension
        if (dotIndex == -1 || dotIndex == 0 || dotIndex == filename.length() - 1) {
          return null;
        }
        return filename.substring(dotIndex).toLowerCase();
    }
}

    
    
