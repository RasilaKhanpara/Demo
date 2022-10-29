package collectionDemo;

import java.util.ArrayList;

public class ArrayListCollection {

	public static void main(String args[]){  
				  
					
				   //Object ObjRef = "dfsdfsd";
						
					ArrayList<Employee> employeeList = new ArrayList<Employee>();
										
					Employee employee1 = new Employee();
					employee1.setEmployeeId(1);
					employee1.setEmployeeName("Moiz");
					employee1.setEmployeeAddress("Thorncliffe");
					
					Employee employee2 = new Employee();
					employee2.setEmployeeId(2);
					employee2.setEmployeeName("Sultan");
					employee2.setEmployeeAddress("Thorncliffe1");
					
					Employee employee3 = new Employee();
					employee3.setEmployeeId(3);
					employee3.setEmployeeName("Ram");
					employee3.setEmployeeAddress("Thorncliffe3");
					
					Employee employee4 = new Employee();
					employee4.setEmployeeId(4);
					employee4.setEmployeeName("Hari");
					employee4.setEmployeeAddress("Thorncliffe4");
					
					employeeList.add(employee1);
					employeeList.add(employee2);
					employeeList.add(employee3);
					employeeList.add(employee4);
					
					System.out.println("employeeList ......"+ employeeList);
					
					for(int i =0 ; i<employeeList.size() ; i++) {
						
						Employee emp = (Employee)employeeList.get(i);
						
						System.out.println("Employee "+i   + emp.getEmployeeId() );
						System.out.println("Employee "+i   + emp.getEmployeeName() );
						System.out.println("Employee "+i   + emp.getEmployeeAddress() );
						
					
					
					}
					
					
					
					
					
					
					/* ArrayList arryListDemo = new ArrayList();
				   arryListDemo.add("Ram");
				   arryListDemo.add("Hari");
				   arryListDemo.add("Moiz");
				   arryListDemo.add("Ram");
				   arryListDemo.add("Ram");
				   arryListDemo.add("Ram");
				   arryListDemo.add("Ram");
				   arryListDemo.add("Ram");
				   arryListDemo.add("Ram");
				   
				   arryListDemo.add("Yogi");
				   arryListDemo.add("Yogi");
				   arryListDemo.add("Yogi");
				   arryListDemo.add("Yogi");
				   arryListDemo.add("Yogi");
				   arryListDemo.add("Yogi");
				   
				   Iterator ref = arryListDemo.iterator();
				   
				   while(ref.hasNext()) {
					   
					 System.out.println(ref.next()); 
				   }
				   
				   
				   
				   System.out.println("Total Objects......"+ arryListDemo.size());
				   
				  for(int i =0 ; i<arryListDemo.size() ; i++) {
					   
					   
					   
					   System.out.println(arryListDemo.get(i));
					   
				   } */
				   
				  
				   
				   
				   
				   
				   
				  
				  
					
			   
					
					
			    /* Stack<String> stack = new Stack<String>();  
				stack.push("Ayush");  
				stack.push("Garvit");  
				stack.push("Amit");  
			    stack.push("Ashish");  
				stack.push("Garima");  
				stack.pop();  
				Iterator<String> itr=stack.iterator();  
				while(itr.hasNext()){  
				System.out.println(itr.next()); 
				} */ 
				}  
			




	}
