package week3.day2;

public class APIClient {

	//Inside the APIClient class, define the sendRequest method with multiple overloaded versions.
	public void sendRequest(String endpoint) {

		System.out.println("The End point for production is:" + endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("The Endpoint for preprod is:" + endpoint + "  The request body description:" + requestBody
				+ "  Request success:" + requestStatus);

	}

	public static void main(String[] args) {
		//Create object for APIClient class
		APIClient apiClient = new APIClient();

		//Call method from both the sendRequest methods with respective arguments
		apiClient.sendRequest("operation.endpoint.production");
		apiClient.sendRequest("operation.endpoint.preprod", "Successfully processed endpoint ", true);

	}

}
