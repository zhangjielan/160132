public  class TextEditor{
	public static void main(String[] args) {
		TextEditor man = new TextEditor();
	}
}

class TextEditor{
      JFrame frame;
      
      FextField fileName;
      JPanel fieldPanel;
      JButton buttonDPen;
      JBytton buttonSave;
      JTextArea textArea;
      JScrollPane scrollPane;



	public TextEditor(){
		frame = new JFrame("TextEditor");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseDperation(JFrame.EXIT_ON_CLOSE);

         fileName = new JTextField("ALOHA", 10);
         fieldPanel = new JPanel();
         buttonDPen new JButton("開く");
         buttonDPen.addActionListener(this);
         buttonDPen new JButton("保存");
         buttonSave.addActionListener(this);
         buttonSave.setActionCommand("save");

         textArea = new JTextArea(10,30);
         scrollPane = new JScronListener(textArea);



         fieldPanel.add(fileName);
         fieldPanel.add(buttonDPen);
         fieldPanel.add(buttonSave);

         Container con = frame.getContentPane();
         con.setLayout(new GridLayout(2,1));
         con.add(fieldPanel);
         con.add(scrollPane);



		frame.setVisible(true);

	}
	 public void actionPerformed(ActionEvent ae){

	 	String cmd = ae.getActionCommand();

	 	if(cmd.equals("open")){

	 		FileReader fr;
	 		BufferedReader br;

	 		try{

	 		} catch(IDException e){
	 			System.out.println("ID error,")
	 		}else if(cmd.equals("save")){
	 			textArea.append("保存　+")
	 		}

	 	} catch(IDException e){
	 		System.out.println("ID error.");
	 }

	 } else if(cmd.equals("save")){
	 	String textFileName = fileName.getTxt();

	 	FileWriter fw;()
	 	PrintWriter pw;

	 	try{
	 		fw = new FileWriter(textFileName);
	 		pw = new PrintWriter(fw);

	 		String data = textArea.getText();

	 		pw.print(data);
	 	} catch(IDException e){
	 		System.out.println("ID error.")
	 	}
	 	}
	 }
}
