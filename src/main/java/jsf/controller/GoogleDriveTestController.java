package jsf.controller;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.google.api.services.drive.Drive;

import googleDriveUtils.DriveQuickstart;
import googleDriveUtils.GDTest;

@RequestScoped
@ManagedBean(name="gdController")
public class GoogleDriveTestController {
	
	public String name;
	public String mediaLink;
	
	Drive driveService ;
	
	@PostConstruct
	public void setupFirst(){
		try {
			driveService= DriveQuickstart.getDriveService();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.name=driveService.getApplicationName();
	}
	
	public String getName(){
		return this.name;
	}

}
