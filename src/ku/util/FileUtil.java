package ku.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Utility of copy file.
 * 
 * @author Totsapon Menkul.
 *
 */
public class FileUtil {

	/**
	 * Copy a file one byte at a time.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 */
	static void copy(InputStream in, OutputStream out) {
		try {
			while (true) {
				int count = in.read();
				if (count < 0)
					break;
				out.write(count);
			}
			in.close();
			out.close();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Copy a file by using block size.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 * 
	 * @param blocksize
	 *            is size of byte that want to copy at one time.
	 * 
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) {
		try {
			byte[] buff = new byte[blocksize];
			while (true) {
				int count = in.read(buff);
				if (count <= 0)
					break; // end
				out.write(buff, 0, count);
			}
			in.close();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Copy a file by using BufferedReader.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 */
	static void bcopy(InputStream in, OutputStream out) {
		try {
			BufferedReader breader = new BufferedReader(new InputStreamReader(in));
			PrintWriter pwriter = new PrintWriter(out);
			while (breader.ready()) {
				String s = breader.readLine();
				pwriter.write(s);
			}
			in.close();
			out.close();
			breader.close();
			pwriter.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Copy a file by using BufferedReader and print out by using BufferedWriter
	 * with size of char array.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 * 
	 * @param blocksize
	 *            is size of byte that want to copy at one time.
	 * 
	 */
	static void charCopy(InputStream in, OutputStream out, int blocksize) {
		try {
			char[] charArr = new char[blocksize];
			BufferedReader breader = new BufferedReader(new InputStreamReader(in));
			BufferedWriter pwriter = new BufferedWriter(new OutputStreamWriter(out));
			while (breader.ready()) {
				int count = breader.read(charArr);
				pwriter.write(charArr, 0, count);
			}
			in.close();
			out.close();
			breader.close();
			pwriter.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
