package ku.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class FileUtil {

	static void copy(InputStream in, OutputStream out) {
		try {
			while (true) {
				int count = in.read();
				if (count < 0)
					break;
				out.write(count);
			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				in.close();
				out.close();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}

	}

	static void copy(InputStream in, OutputStream out, int blocksize) {
		byte[] buff = new byte[blocksize];
		try {
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

	static void bcopy(InputStream in, OutputStream out) {
		BufferedReader breader = new BufferedReader(new InputStreamReader(in));
		PrintWriter pwriter = new PrintWriter(out);
		try {
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

	static void charCopy(InputStream in, OutputStream out, int blocksize) {
		char[] charArr = new char[blocksize];
		BufferedReader breader = new BufferedReader(new InputStreamReader(in));
		BufferedWriter pwriter = new BufferedWriter(new OutputStreamWriter(out));
		try {
			while (breader.ready()) {
				int count = breader.read(charArr);
				pwriter.write(charArr, 0, count);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
