	//Drawing_Face_Demo.java
	import javax.swing.JFrame;
	public class Drawing_Face_Demo {
		public static void main(String[] args) {
			JFrame frame = new JFrame("Drawing Demo");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Face_Drawing_Panel panel = new Face_Drawing_Panel();
			frame.getContentPane().add(panel);
			frame.pack();
			frame.setVisible(true);
		}
	}
