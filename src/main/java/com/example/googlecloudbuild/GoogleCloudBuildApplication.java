package com.example.googlecloudbuild;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.cloud.devtools.cloudbuild.v1.CloudBuildClient;
import com.google.cloud.devtools.cloudbuild.v1.CloudBuildSettings;
import com.google.cloud.devtools.cloudbuild.v1.stub.CloudBuildStubSettings;
import com.google.cloudbuild.v1.Build;
import com.google.cloudbuild.v1.BuildTrigger;
import com.google.cloudbuild.v1.CreateBuildRequest;
import com.google.cloudbuild.v1.CreateBuildTriggerRequest;
import com.google.cloudbuild.v1.LocationName;

@SpringBootApplication
public class GoogleCloudBuildApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(GoogleCloudBuildApplication.class, args);

		
		try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) {
			      String projectId = "ashutosh-poc";
			      Build build = Build.newBuilder().build();
			      Build response = cloudBuildClient.createBuildAsync(projectId, build).get();
			    }
		try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) {
			      CreateBuildRequest request =
			          CreateBuildRequest.newBuilder()
			              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
			             .setProjectId("ashutosh-poc")
			              .setBuild(Build.newBuilder().build())
			              .build();
			      Build response = cloudBuildClient.createBuildAsync(request).get();
			    }
		
		
		
		
		/*
		 * CloudBuildSettings.Builder cloudBuildSettingsBuilder =
		 * CloudBuildSettings.newBuilder(); cloudBuildSettingsBuilder
		 * .getBuildSettings() .setRetrySettings( cloudBuildSettingsBuilder
		 * .getBuildSettings() .getRetrySettings() .toBuilder().build()); //
		 * .setTotalTimeout(Duration.ofSeconds(30)) // .build()); CloudBuildSettings
		 * cloudBuildSettings = cloudBuildSettingsBuilder.build();
		 * 
		 * CloudBuildClient.create(cloudBuildSettings);
		 * 
		 * 
		 * CloudBuildStubSettings.Builder cloudBuildStubSettingsBuilder =
		 * CloudBuildStubSettings.newBuilder(); cloudBuildSettingsBuilder
		 * .getBuildSettings() .setRetrySettings( cloudBuildSettingsBuilder
		 * .getBuildSettings() .getRetrySettings() .toBuilder().build());
		 * //.setTotalTimeout(Duration.ofSeconds(30)) //.build());
		 * CloudBuildStubSettings cloudBuildStubSettings =
		 * cloudBuildStubSettingsBuilder.build();
		 * 
		 * CloudBuildClient.create(null)
		 * 
		 * 
		 * // new CloudBuildClient(cloudBuildSettings);
		 * 
		 * CloudBuildClient.class.getSimpleName();
		 * 
		 * try ( CloudBuildClient cloudBuildClient = CloudBuildClient.create()) { String
		 * projectId = "ashutosh-poc"; BuildTrigger trigger =
		 * BuildTrigger.newBuilder().build(); BuildTrigger response =
		 * cloudBuildClient.createBuildTrigger(projectId, trigger); }
		 * catch(InvalidArgumentException e) { System.err.println(e); }
		 * 
		 * 
		 * try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) {
		 * CreateBuildTriggerRequest request = CreateBuildTriggerRequest.newBuilder()
		 * .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
		 * .setProjectId("ashutosh-poc") .setTrigger(BuildTrigger.newBuilder().build())
		 * .build(); BuildTrigger response =
		 * cloudBuildClient.createBuildTrigger(request); }
		 */

		// CloudBuildSettings.create(cloudBuildStubSettings);

		/*
		 * try (CloudBuildClient cloudBuildClient = CloudBuildClient.create()) { String
		 * projectId = "big-calling-380505"; String id = "id3355"; //Build response =
		 * cloudBuildClient.getBuild(projectId, id);
		 */
	}

	// CloudBildClient.create(CloudBuildSettings settings);
	// oudBuildSettings cloudBuildSettings = new CloudBuildSettings(null);
	// loudBuildSettings.createBuildSettings() ;
	/*
	 * CloudBuildSettings cloudBuildSettings = CloudBuildSettings.newBuilder()
	 * .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
	 * .build(); CloudBuildClient cloudBuildClient =
	 * CloudBuildClient.create(cloudBuildSettings);
	 *//*
		 * CloudBuildSettings cloudBuildSettings =
		 * CloudBuildSettings.newBuilder().setEndpoint(
		 * "us-central1-cloudBuild.googleapis.com:443").build(); CloudBuildClient
		 * cloudBuildClient = CloudBuildClient.create(cloudBuildSettings);
		 * 
		 * CloudBuildClient.create().createBuildTrigger("big-calling-380505",
		 * BuildTrigger.newBuilder().build());
		 */
	/*
	 * CloudBuildClient cbc =new CloudBuildClient(settings); CloudBuildSettings
	 * settings=new CloudBuildSettings(settings);
	 * 
	 * try { CloudBuildClient.create().createBuildTrigger("big-calling-380505",
	 * BuildTrigger.newBuilder().build()); } catch (Exception e) {
	 * e.printStackTrace();
	 * 
	 * } try {
	 * CloudBuildClient.create().createBuildTrigger(CreateBuildTriggerRequest.
	 * newBuilder() .setParent(LocationName.of("[PROJECT]",
	 * "[LOCATION]").toString()) .setProjectId("big-calling-380505")
	 * .setTrigger(BuildTrigger.newBuilder().build()) .build()); } catch
	 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace();
	 * 
	 * }
	 * 
	 * 
	 * try { CloudBuildClient.create().createBuildTriggerCallable(); } catch
	 * 
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * 
	 * try { CloudBuildClient.create(); } catch (IOException f) { // TODO
	 * Auto-generated catch block f.printStackTrace(); }
	 * 
	 * try { CloudBuildClient.create(CloudBuildSettings.newBuilder()
	 * .setEndpoint("us-central1-cloudBuild.googleapis.com:443").build()); } catch
	 * (IOException g) { g.printStackTrace(); }
	 * 
	 * CloudBuildSettings.newBuilder()
	 * .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
	 * .build();
	 * 
	 * CloudBuildClient.create().getSettings();
	 * 
	 * try { CloudBuildClient.create().settings.createBuildSettings(); } catch
	 * (IOException f) { // TODO Auto-generated catch block f.printStackTrace(); }
	 * 
	 * }
	 */

}