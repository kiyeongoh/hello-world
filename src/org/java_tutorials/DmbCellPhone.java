package org.java_tutorials;

public class DmbCellPhone extends CellPhone{
 int channel;
 
 DmbCellPhone(String model,String color,int channel){
	 this.model = model;
	 this.color = color;
	 this.channel = channel;
 }
 
 void turnOnDmb(){
	 System.out.println("ä��" + channel + "��  DMB ��� ������ �����մϴ�");
 }
 void changeCannelDmb(int channel){
	 this.channel = channel;
	 System.out.println("ä��" + channel + "������ �ٲ��ϴ�");
	 }
 void turnOffDmb(){
	 System.out.println("DMB ��� ������ ����ϴ�");
 }
}
