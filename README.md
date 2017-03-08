# FileIO tasks by Totsapon menkul (*)
Big-Alice-in-Wonderland.txt sized 2,101,560 bytes.
I ran the tasks on a ASUS , and got
these results:

 Task | Time 
 --------------------------------------|-------:
 Copy the file one byte at a time. | 7.039303 sec
 Copy file using block size 1KB a time. | 0.012228 sec
 Copy file using block size 4KB a time. | 0.005332 sec
 Copy file using block size 64KB a time. | 0.002293 sec
 Copy file by using BufferedReader. | 0.050354 sec
 Copy file by using BufferedReader with 1KB array of char. | 0.012339 sec
## Explanation of Results
Copy file one byte at a time is the slowest one because its read and copy text file one byte at a time.

Using BuffredReader is more slower than copy file by using an array(block size). Because bufferedReader read and copy a text file by each line. But using a block size it will read a file depends on how big of block size is. For example of 1 KB it will read a text file in number of 1024 bytes which means it will read 1024 char at a time. So if we increase number of block size will take shorter time to read and make a copy of a file.

BufferedReader by using 1 KB array of char is pretty much the same as InputStream 1 KB of array.
