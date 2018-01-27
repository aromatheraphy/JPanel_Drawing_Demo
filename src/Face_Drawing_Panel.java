	//Face_Drawing_Panel.java
	import javax.swing.JPanel;
	import java.awt.*;
	public class Face_Drawing_Panel extends JPanel {
		public int base_point_x=130;
		public int base_point_y=110;
	
		public Face_Drawing_Panel() {
			setBackground(Color.BLACK);
			setPreferredSize(new Dimension (350,350));
			setFont(new Font("Times New Roman", Font.ITALIC, 30));
		}
		public void paintComponent(Graphics page) {
			super.paintComponent(page);
			page.setColor(Color.MAGENTA);
			page.fillOval(base_point_x, base_point_y, 100, 100);//For HEAD
			page.fillOval(base_point_x-5, base_point_y+25, 15, 40);//Left EAR
			page.fillOval(base_point_x+90, base_point_y+25, 15, 40);//Right EAR
		
			page.setColor(Color.black);
			page.drawOval(base_point_x+20, base_point_y+29, 18, 10); //Left EYE
			page.drawOval(base_point_x+60, base_point_y+29, 18, 10); //Right EYE
		
			page.fillOval(base_point_x+25, base_point_y+30, 8, 8); //Left PUPIL
			page.fillOval(base_point_x+65, base_point_y+30, 8, 8); //Right PUPIL
		
			page.drawArc(base_point_x+20, base_point_y+25, 18, 10, 0, 180); //Left Eyebrow
			page.drawArc(base_point_x+60, base_point_y+25, 18, 10, 0, 180); //Left Eyebrow
		
			page.drawArc(base_point_x+40, base_point_y+55, 18, 10, 180, 180); //NOSE
			page.drawArc(base_point_x+25, base_point_y+60, 45, 18, 180, 180); //MOUTH
		
			page.setColor(Color.white);
			page.drawString("@aromatheraphy", base_point_x-45, base_point_y-45);
		}
	}
