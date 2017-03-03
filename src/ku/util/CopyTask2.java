package ku.util;

/**
 * Copy file 1KB at a time.
 * 
 * @author Totsapon Menkul.
 *
 */
public class CopyTask2 extends FileCopyTask {
	private final int ONEKB = 1024;

	/**
	 * Copy a file 1KB at a time.
	 * 
	 * @param in
	 *            is the input file that want to be read.
	 * @param out
	 *            is the copied file.
	 */
	public CopyTask2(String infile, String outfile) {
		super(infile, outfile);
	}

	@Override
	/** Run the task */
	public void run() {
		FileUtil.copy(in, out, ONEKB);
	}

	@Override
	/** Describe the task */
	public String toString() {
		return String.format("Copy file 1KB a time.");
	}

}