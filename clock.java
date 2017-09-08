import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class clock{
	JFrame frame;
	JPanel panel;
	JTextArea text;
	JButton button;
	int i,j;
	public static void main(String[] args) {
		clock c = new clock();
		c.go();	
	}
	public void go(){
		button=new JButton("RESET");
		frame=new JFrame();
		panel=new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		text=new JTextArea(10,20);
		text.setLineWrap(true);
		panel.add(button);panel.add(text);
		text.setFont(new Font("Serif",Font.PLAIN,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1400,1000);
		frame.setVisible(true);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		button.addActionListener(new b());
		for(i=1;i<=60;i++){
			for(j=90;j>0;j--){
				text.setText("  "+j);
				Thread thread=new Thread();
				try{
					thread.sleep(1000);
				}
				catch(InterruptedException ex){
					thread.currentThread().interrupt();
				}
			}
		}
	}
			class b implements ActionListener{
			public void actionPerformed(ActionEvent event){
				text.setText("  "+90);j=90;i=1;
			}
		}
}
