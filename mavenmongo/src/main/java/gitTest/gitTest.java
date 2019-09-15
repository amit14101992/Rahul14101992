package gitTest;

import java.util.Iterator;
import org.bson.Document;
import org.json.JSONArray;
import org.json.JSONObject;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;


public class gitTest {
	public static void main(String[] args) {
   
   //First, let's make a connection to a MongoDB server
	MongoClient mongoClient = new MongoClient("localhost", 27017);
   // getting connected with dbs
	MongoDatabase db = mongoClient.getDatabase("Testmongo");
  //               retrieving a collection	
	MongoCollection<Document> tb = db.getCollection("inventory"); 
	
    // Getting the iterable object 
   /* FindIterable<Document> iterDoc = tb.find();   
    // Getting the iterator 
    Iterator it = iterDoc.iterator();   
    while (it.hasNext()) {  
       System.out.println(it.next());  
	}*/
    
                        //update   
    //tb.updateOne(Filters.eq("item","journal"), Updates.set("instock.0.qty", 150));       
    //System.out.println("Document update successfully...");
    
    FindIterable<Document> iterDoc = tb.find();   
                   //Getting the iterator 
    //Iterator it = iterDoc.iterator();   
    //while (it.hasNext()) {  
      // System.out.println(it.next());  
	//}
    // itrating via foeach loop
    JSONArray obj = new JSONArray();
    for(Document s : iterDoc)
    {
    	   obj.put(s.toJson());      
    }
   
    
                       //deleting
    //tb.deleteOne(Filters.eq("id", 1)); 
    //System.out.println("Document deleted successfully...");
}	
} 