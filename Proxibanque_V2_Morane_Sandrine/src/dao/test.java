package dao;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        DAOclient dao = new DAOclient();
       
        //dao.insert(client1);
        //dao.update("15 rue du fox", 1);
        //dao.delete(1);
        //System.out.println(dao.SelectAll());
        System.out.println(dao.getByidClient(1));
		
	}

}
