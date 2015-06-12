<?php

   $json = file_get_contents("php://input");
   

   if (json_decode($json) != null) {
     $file = fopen('list.json','w');
     fwrite($file, $json);
     fclose($file);
   } else {
     echo "error writing file";
   }

?>