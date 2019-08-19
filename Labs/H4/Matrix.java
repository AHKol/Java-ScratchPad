public class Matrix <T>{
	private T[][] element;
	private int nrows, ncols;
	
	public Matrix(int nrows, int ncols) {}
	public Matrix(Matrix source) {}
	public Matrix(T[][] b) {}
	public Matrix add(Matrix second) throws IllegalMatrixDimensionExeption{}
	public byte val(int r, int c) throws OutOfRangeMatrixIndexException {}
	public ​void​ ​setElement(byte​ ​val,​ ​int​ ​r,​ ​int​ ​c)​ ​throws OutOfRangeMatrixIndexException​ ​{}
	public static byte max() {}
	public static void main(String[] args) {}
}