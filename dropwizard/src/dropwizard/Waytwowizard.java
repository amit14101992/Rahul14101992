package dropwizard;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Waytwowizard extends Application<Configuration>{

	  public static void main(String[] args) throws Exception {
	        new Waytwowizard().run(args);
	    }
	 
	    @Override
	    public void initialize(Bootstrap<Configuration> bootstrap) {
	        // nothing to do yet
	    }
	   
		@Override
		public void run(Configuration c, Environment e) throws Exception {
			 e.jersey().register(new Controller());
		} 

}
