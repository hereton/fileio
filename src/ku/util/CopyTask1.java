package ku.util;

/**
 * Copy a file 1 Byte at a time.
 * 
 * @author Totsapon Menkul.
 *
 */
public class CopyTask1 extends FileCopyTask {

	/**
	 * Copy a file 1 Byte at a time.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 */
	public CopyTask1(String infile, String outfile) {
		super(infile, outfile);
	}

	@Override
	/** run the task */
	public void run() {
		FileUtil.copy(in, out);
	}

	@Override
	/** Describe the task */
	public String toString() {
		return String.format("Copy file one byte at a time.");
	}

}
