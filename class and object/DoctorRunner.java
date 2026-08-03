class DoctorRunner{

public static void main(String[]a){

Doctor doctor=new Doctor();
doctor.doctorName="Dr.Anoop Misra";
doctor.designation="Executive chairman Fortis C doc";
String specifications[]={"Diobetology","Endocrinology"};
doctor.specification=specifications;
doctor.experience=40;
doctor.fees=2800;
System.out.println("==============first docotor information===================");
System.out.println("doctor name is : "+doctor.doctorName);
System.out.println("doctor designation is : "+doctor.designation);
System.out.println("doctor specification is : ");
for(String special:doctor.specification){
	System.out.println(special);
}
System.out.println("doctor experience is : "+doctor.experience+" years");
System.out.println("doctor fees per person is : "+doctor.fees);


Doctor doctor1=new Doctor();
doctor1.doctorName="Dr.Amit javed";
doctor1.designation="peinciple Director";
String[] specifications1={"cardiac Sciences","Interventional Cardiology"};
doctor1.specification=specifications1;
doctor1.experience=35;
doctor1.fees=2000;

System.out.println("==================second doctor information==================");
System.out.println("docotr1 name is : "+doctor1.doctorName);
System.out.println("doctor1 designation is : "+doctor1.designation);
System.out.println("doctor specification is : ");
for(String special:doctor1.specification){
	System.out.println(special);
}
System.out.println("doctor1 experience is : "+doctor1.experience);
System.out.println("doctor1 fees is "+doctor1.fees);

Doctor doctor2=new Doctor();
doctor2.doctorName="Dr.Manjinder Sandhu";
doctor2.designation="principle Director Cardiology";
String[] specifications2={"Cardiac Sciences","interventional Cardiology"};
doctor2.specification=specifications2;
doctor2.experience=35;
doctor2.fees=2000;

System.out.println("================third doctor information=================");
System.out.println("doctor2 name is : "+doctor2.doctorName);
System.out.println("doctor2 designation is "+doctor2.designation);
System.out.println("doctor2 specifications :");
for(String special:doctor2.specification){
	System.out.println(special);
}
System.out.println("doctor2 experience is : "+doctor2.experience);
System.out.println("doctor2 fees : "+doctor2.fees);

Doctor doctor3=new Doctor();
doctor3.doctorName="Dr.Ajay Agarwal";
doctor3.designation="Chairman";
String[] specifications3={"support Specialitie","internal Medicine"};
doctor3.specification=specifications3;
doctor3.experience=25;
doctor3.fees=1400;

System.out.println("==========fourth doctor information]====================");
System.out.println("doctor3 name is "+doctor3.doctorName);
System.out.println("doctor3 designation is "+doctor3.designation);
System.out.println("docotor3 specifications is :");
for(String special:doctor3.specification){
	System.out.println(special);
}
System.out.println("doctor3 experience is "+doctor3.experience);
System.out.println("doctor3 fees per person is"+doctor3.fees);

Doctor doctor4=new Doctor();
doctor4.doctorName="Dr.Ajay Kaul";
doctor4.designation="chairman cardiac Science";
String[] specifications4={"Cardiac Sciences","vascular Surgery","Heart Transplant","Adult CTVS","paediatric CTVS"};
doctor4.specification=specifications4;
doctor4.experience=38;
doctor4.fees=1600;

System.out.println("===================fifth doctor information====================");
System.out.println("Doctor4 name is "+doctor4.doctorName);
System.out.println("doctor4 designation is "+doctor4.designation);
System.out.println("doctor4 specifiaction is ");
for(String special:doctor4.specification){
	System.out.println(special);
}
System.out.println("doctor4 experience is "+doctor4.experience);
System.out.println("doctor4 fees per person "+doctor4.fees);

Doctor doctor5=new Doctor();
doctor5.doctorName="Dr.Ajay Kumar Kriplani";
doctor5.designation="principle Director & HOD LAp GI,GI ONco";
String[] specifications5={"Genral Surgery","Gastroenterology ","Hepatobility Sciences"};
doctor5.specification=specifications5;
doctor5.experience=40;
doctor5.fees=1500;

System.out.println("=============sixth doctor information=================");
System.out.println("doctor5 Name is "+doctor5.doctorName);
System.out.println("doctor5 designation is "+doctor5.designation);
System.out.println("doctro5 specifiaction is ");
for(String special:doctor5.specification){
	System.out.println(special);
}
System.out.println("doctor5 experience is "+doctor5.experience);
System.out.println("doctro5 fees is "+doctor5.fees);

Doctor doctor6=new Doctor();
doctor6.doctorName="Dr.ajit Singh Narula";
doctor6.designation="principle Director Nephrology";
String[] specifications6={"organ Transplate","nephrology"};
doctor6.specification=specifications6;
doctor6.experience=40;
doctor6.fees=2000;

System.out.println("=============sevnth doctor information=================");
System.out.println("doctor6 name is "+doctor6.doctorName);
System.out.println("doctor6 designation is"+doctor6.designation);
System.out.println("doctor6 specifiaction is ");
for(String special:doctor6.specification){
	System.out.println(special);
}
System.out.println("doctor6 experience is "+doctor6.experience);
System.out.println("doctor6 fees is "+doctor6.fees);

Doctor doctor7=new Doctor();
doctor7.doctorName="Dr.Amite pankaj Aggarwal";
doctor7.designation="Principle Director & HOD";
String[] specifications7={"orthopaedics and joint replacement","orthopaedics","Sports medicine","Robotics and computer NAvigation joint reconstruction"};
doctor7.specification=specifications7;
doctor7.experience=27;
doctor7.fees=1500;

System.out.println("============8th doctor information====================");
System.out.println("doctor7 name is "+doctor7.doctorName);
System.out.println("doctor7 designation "+doctor7.designation);
System.out.println("doctor7 specifications is ");
for(String special:doctor7.specification){
	System.out.println(special);
}
System.out.println("doctor7 experience is "+doctor7.experience);
System.out.println("doctor7 fees per person is "+doctor7.fees);

Doctor doctor8 = new Doctor();
doctor8.doctorName = "Dr. Anil Mandhani";
doctor8.designation = "Chairman - Urology | FMRI Gurgaon";
String[] specifications8 = {"Urology", "Uro-Oncology", "Robotic Surgery", "Organ Transplant", "Kidney Transplant"};
doctor8.specification = specifications8;
doctor8.experience = 35;
doctor8.fees = 2000;

System.out.println("============== Ninth Doctor Information ==============");
System.out.println("Doctor Name : " + doctor8.doctorName);
System.out.println("Designation : " + doctor8.designation);
System.out.println("Specifications :");
for(String special : doctor8.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor8.experience + " Years");
System.out.println("Fees : ₹" + doctor8.fees);


Doctor doctor9 = new Doctor();
doctor9.doctorName = "Dr. Anil Saxena";
doctor9.designation = "Chairman Cardiology | Fortis Okhla";
String[] specifications9 = {"Cardiac Sciences", "Electrophysiology"};
doctor9.specification = specifications9;
doctor9.experience = 35;
doctor9.fees = 2000;

System.out.println("============== Tenth Doctor Information ==============");
System.out.println("Doctor Name : " + doctor9.doctorName);
System.out.println("Designation : " + doctor9.designation);
System.out.println("Specifications :");
for(String special : doctor9.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor9.experience + " Years");
System.out.println("Fees : ₹" + doctor9.fees);


Doctor doctor10 = new Doctor();
doctor10.doctorName = "Dr. Anita Saxena";
doctor10.designation = "Executive Director Paediatric Cardiology | Fortis Okhla";
String[] specifications10 = {"Paediatrics", "Paediatric Cardiac Sciences"};
doctor10.specification = specifications10;
doctor10.experience = 40;
doctor10.fees = 2000;

System.out.println("============== Eleventh Doctor Information ==============");
System.out.println("Doctor Name : " + doctor10.doctorName);
System.out.println("Designation : " + doctor10.designation);
System.out.println("Specifications :");
for(String special : doctor10.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor10.experience + " Years");
System.out.println("Fees : ₹" + doctor10.fees);


Doctor doctor11 = new Doctor();
doctor11.doctorName = "Dr. Ankur Bahl";
doctor11.designation = "Principal Director Medical Oncology | FMRI Gurgaon";
String[] specifications11 = {"Oncology", "Medical Oncology"};
doctor11.specification = specifications11;
doctor11.experience = 20;
doctor11.fees = 1800;

System.out.println("============== Twelfth Doctor Information ==============");
System.out.println("Doctor Name : " + doctor11.doctorName);
System.out.println("Designation : " + doctor11.designation);
System.out.println("Specifications :");
for(String special : doctor11.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor11.experience + " Years");
System.out.println("Fees : ₹" + doctor11.fees);

Doctor doctor12 = new Doctor();
doctor12.doctorName = "Dr. Arvind Kumar";
doctor12.designation = "Principal Director & HOD Paediatrics | Fortis Shalimar Bagh";
String[] specifications12 = {"Paediatrics"};
doctor12.specification = specifications12;
doctor12.experience = 42;
doctor12.fees = 1500;

System.out.println("=============== Thirteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor12.doctorName);
System.out.println("Designation : " + doctor12.designation);
System.out.println("Specifications :");
for(String special : doctor12.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor12.experience + " Years");
System.out.println("Fees : " + doctor12.fees);


Doctor doctor13 = new Doctor();
doctor13.doctorName = "Dr. Arvind Kumar Khurana";
doctor13.designation = "Principal Director Gastroenterology | FMRI Gurgaon";
String[] specifications13 = {"Gastroenterology and Hepatobiliary Sciences", "Gastroenterology"};
doctor13.specification = specifications13;
doctor13.experience = 35;
doctor13.fees = 1500;

System.out.println("=============== Fourteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor13.doctorName);
System.out.println("Designation : " + doctor13.designation);
System.out.println("Specifications :");
for(String special : doctor13.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor13.experience + " Years");
System.out.println("Fees : " + doctor13.fees);


Doctor doctor14 = new Doctor();
doctor14.doctorName = "Dr. Ashok Seth";
doctor14.designation = "Chairman Cardiac Sciences | Fortis Okhla";
String[] specifications14 = {"Cardiac Sciences", "Interventional Cardiology"};
doctor14.specification = specifications14;
doctor14.experience = 40;
doctor14.fees = 7500;

System.out.println("=============== Fifteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor14.doctorName);
System.out.println("Designation : " + doctor14.designation);
System.out.println("Specifications :");
for(String special : doctor14.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor14.experience + " Years");
System.out.println("Fees : " + doctor14.fees);


Doctor doctor15 = new Doctor();
doctor15.doctorName = "Dr. Atul Mathur";
doctor15.designation = "Chairman Cardiology | Fortis Okhla";
String[] specifications15 = {"Cardiac Sciences", "Interventional Cardiology"};
doctor15.specification = specifications15;
doctor15.experience = 34;
doctor15.fees = 2000;

System.out.println("=============== Sixteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor15.doctorName);
System.out.println("Designation : " + doctor15.designation);
System.out.println("Specifications :");
for(String special : doctor15.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor15.experience + " Years");
System.out.println("Fees : " + doctor15.fees);


Doctor doctor16 = new Doctor();
doctor16.doctorName = "Dr. Atul Mishra";
doctor16.designation = "Chairman - Orthopaedics & Joint Replacement | Fortis Noida";
String[] specifications16 = {"Orthopaedics", "Joint Replacement", "Sports Medicine", "Robotic and Computer Navigated Joint Reconstruction"};
doctor16.specification = specifications16;
doctor16.experience = 27;
doctor16.fees = 1500;

System.out.println("=============== Seventeenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor16.doctorName);
System.out.println("Designation : " + doctor16.designation);
System.out.println("Specifications :");
for(String special : doctor16.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor16.experience + " Years");
System.out.println("Fees : " + doctor16.fees);


Doctor doctor17 = new Doctor();
doctor17.doctorName = "Dr. Atul Kumar Mittal";
doctor17.designation = "Chairman ENT | FMRI Gurgaon";
String[] specifications17 = {"ENT (Ear, Nose and Throat)"};
doctor17.specification = specifications17;
doctor17.experience = 33;
doctor17.fees = 2000;

System.out.println("=============== Eighteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor17.doctorName);
System.out.println("Designation : " + doctor17.designation);
System.out.println("Specifications :");
for(String special : doctor17.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor17.experience + " Years");
System.out.println("Fees : " + doctor17.fees);


Doctor doctor18 = new Doctor();
doctor18.doctorName = "Dr. Balkar Singh";
doctor18.designation = "Principal Director Anaesthesiology | FMRI Gurgaon";
String[] specifications18 = {"Support Specialties", "Anaesthesia"};
doctor18.specification = specifications18;
doctor18.experience = 30;
doctor18.fees = 2500;

System.out.println("=============== Nineteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor18.doctorName);
System.out.println("Designation : " + doctor18.designation);
System.out.println("Specifications :");
for(String special : doctor18.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor18.experience + " Years");
System.out.println("Fees : " + doctor18.fees);


Doctor doctor19 = new Doctor();
doctor19.doctorName = "Dr. Biswajyoti Hazarika";
doctor19.designation = "Principal Director Surgical Oncology | FMRI Gurgaon";
String[] specifications19 = {"Oncology", "Head and Neck Oncosurgery", "Surgical Oncology"};
doctor19.specification = specifications19;
doctor19.experience = 25;
doctor19.fees = 1800;

System.out.println("=============== Twentieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor19.doctorName);
System.out.println("Designation : " + doctor19.designation);
System.out.println("Specifications :");
for(String special : doctor19.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor19.experience + " Years");
System.out.println("Fees : " + doctor19.fees);

Doctor doctor20 = new Doctor();
doctor20.doctorName = "Dr. Gourdas Choudhuri";
doctor20.designation = "Chairman - Gastroenterology | FMRI Gurgaon";
String[] specifications20 = {"Gastroenterology and Hepatobiliary Sciences", "Gastroenterology"};
doctor20.specification = specifications20;
doctor20.experience = 42;
doctor20.fees = 2000;

System.out.println("=============== Twenty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor20.doctorName);
System.out.println("Designation : " + doctor20.designation);
System.out.println("Specifications :");
for(String special : doctor20.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor20.experience + " Years");
System.out.println("Fees : " + doctor20.fees);


Doctor doctor21 = new Doctor();
doctor21.doctorName = "Dr. Gurinder Bedi";
doctor21.designation = "Principal Director & HOD - Orthopaedics | Fortis Vasant Kunj";
String[] specifications21 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer Navigated Joint Reconstruction",
    "Spine Surgery",
    "Paediatric Orthopaedics"
};
doctor21.specification = specifications21;
doctor21.experience = 30;
doctor21.fees = 1800;

System.out.println("=============== Twenty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor21.doctorName);
System.out.println("Designation : " + doctor21.designation);
System.out.println("Specifications :");
for(String special : doctor21.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor21.experience + " Years");
System.out.println("Fees : " + doctor21.fees);


Doctor doctor22 = new Doctor();
doctor22.doctorName = "Dr. Ishita B. Sen";
doctor22.designation = "Principal Director Nuclear Medicine | FMRI Gurgaon";
String[] specifications22 = {
    "Nuclear Medicine",
    "Oncology"
};
doctor22.specification = specifications22;
doctor22.experience = 26;
doctor22.fees = 2500;

System.out.println("=============== Twenty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor22.doctorName);
System.out.println("Designation : " + doctor22.designation);
System.out.println("Specifications :");
for(String special : doctor22.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor22.experience + " Years");
System.out.println("Fees : " + doctor22.fees);


Doctor doctor23 = new Doctor();
doctor23.doctorName = "Dr. Jaideep Bansal";
doctor23.designation = "Principal Director & HOD Neurology | Fortis Shalimar Bagh";
String[] specifications23 = {
    "Neurology"
};
doctor23.specification = specifications23;
doctor23.experience = 30;
doctor23.fees = 2200;

System.out.println("=============== Twenty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor23.doctorName);
System.out.println("Designation : " + doctor23.designation);
System.out.println("Specifications :");
for(String special : doctor23.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor23.experience + " Years");
System.out.println("Fees : " + doctor23.fees);

Doctor doctor24 = new Doctor();
doctor24.doctorName = "Dr. Jayant Arora";
doctor24.designation = "Principal Director & Unit Head Orthopaedics | FMRI Gurgaon";
String[] specifications24 = {
    "Orthopaedics",
    "Sports Medicine",
    "Spine Surgery",
    "Orthopaedic Oncology",
    "Robotic and Computer Navigated Joint Reconstruction"
};
doctor24.specification = specifications24;
doctor24.experience = 26;
doctor24.fees = 2500;

System.out.println("=============== Twenty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor24.doctorName);
System.out.println("Designation : " + doctor24.designation);
System.out.println("Specifications :");
for(String special : doctor24.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor24.experience + " Years");
System.out.println("Fees : " + doctor24.fees);


Doctor doctor25 = new Doctor();
doctor25.doctorName = "Dr. Kameshwar Prasad";
doctor25.designation = "Principal Director Neurology | Fortis Vasant Kunj";
String[] specifications25 = {"Neurology"};
doctor25.specification = specifications25;
doctor25.experience = 40;
doctor25.fees = 1800;

System.out.println("=============== Twenty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor25.doctorName);
System.out.println("Designation : " + doctor25.designation);
System.out.println("Specifications :");
for(String special : doctor25.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor25.experience + " Years");
System.out.println("Fees : " + doctor25.fees);


Doctor doctor26 = new Doctor();
doctor26.doctorName = "Dr. Krishan Chugh";
doctor26.designation = "Principal Director & HOD - Paediatrics | FMRI Gurgaon";
String[] specifications26 = {"Paediatrics"};
doctor26.specification = specifications26;
doctor26.experience = 32;
doctor26.fees = 2000;

System.out.println("=============== Twenty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor26.doctorName);
System.out.println("Designation : " + doctor26.designation);
System.out.println("Specifications :");
for(String special : doctor26.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor26.experience + " Years");
System.out.println("Fees : " + doctor26.fees);


Doctor doctor27 = new Doctor();
doctor27.doctorName = "Dr. Krishna Subramony Iyer";
doctor27.designation = "Chairman & Head Paediatric and Congenital Heart Surgery | Fortis Okhla";
String[] specifications27 = {
    "Paediatrics",
    "Paediatric CTVS",
    "Paediatric Cardiac Sciences"
};
doctor27.specification = specifications27;
doctor27.experience = 40;
doctor27.fees = 1500;

System.out.println("=============== Twenty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor27.doctorName);
System.out.println("Designation : " + doctor27.designation);
System.out.println("Specifications :");
for(String special : doctor27.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor27.experience + " Years");
System.out.println("Fees : " + doctor27.fees);


Doctor doctor28 = new Doctor();
doctor28.doctorName = "Dr. Manoj Miglani";
doctor28.designation = "Principal Director Orthopaedics | Fortis Vasant Kunj";
String[] specifications28 = {
    "Orthopaedics",
    "Orthopaedics and Spine Surgery",
    "Joint Replacement"
};
doctor28.specification = specifications28;
doctor28.experience = 20;
doctor28.fees = 1500;

System.out.println("=============== Twenty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor28.doctorName);
System.out.println("Designation : " + doctor28.designation);
System.out.println("Specifications :");
for(String special : doctor28.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor28.experience + " Years");
System.out.println("Fees : " + doctor28.fees);


Doctor doctor29 = new Doctor();
doctor29.doctorName = "Dr. Manoj Kumar Goel";
doctor29.designation = "Principal Director & Unit Head - Pulmonology & Sleep Medicine | FMRI Gurgaon";
String[] specifications29 = {
    "Pulmonology",
    "Sleep Medicine",
    "Critical Care"
};
doctor29.specification = specifications29;
doctor29.experience = 32;
doctor29.fees = 2000;

System.out.println("=============== Thirtieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor29.doctorName);
System.out.println("Designation : " + doctor29.designation);
System.out.println("Specifications :");
for(String special : doctor29.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor29.experience + " Years");
System.out.println("Fees : " + doctor29.fees);


Doctor doctor30 = new Doctor();
doctor30.doctorName = "Dr. Meenakshi Ahuja";
doctor30.designation = "Principal Director Obstetrics & Gynaecology | Fortis La Femme GK II";
String[] specifications30 = {
    "Obstetrics and Gynaecology"
};
doctor30.specification = specifications30;
doctor30.experience = 35;
doctor30.fees = 2000;

System.out.println("=============== Thirty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor30.doctorName);
System.out.println("Designation : " + doctor30.designation);
System.out.println("Specifications :");
for(String special : doctor30.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor30.experience + " Years");
System.out.println("Fees : " + doctor30.fees);

Doctor doctor31 = new Doctor();
doctor31.doctorName = "Dr. Mohan Keshavamurthy";
doctor31.designation = "Principal Director Urology | Fortis BG Road";
String[] specifications31 = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor31.specification = specifications31;
doctor31.experience = 37;
doctor31.fees = 1800;

System.out.println("=============== Thirty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor31.doctorName);
System.out.println("Designation : " + doctor31.designation);
System.out.println("Specifications :");
for(String special : doctor31.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor31.experience + " Years");
System.out.println("Fees : " + doctor31.fees);


Doctor doctor32 = new Doctor();
doctor32.doctorName = "Dr. Mohan Keshavamurthy And Team 1";
doctor32.designation = "Principal Director Urology | Fortis BG Road";
String[] specifications32 = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor32.specification = specifications32;
doctor32.experience = 37;
doctor32.fees = 1800;

System.out.println("=============== Thirty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor32.doctorName);
System.out.println("Designation : " + doctor32.designation);
System.out.println("Specifications :");
for(String special : doctor32.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor32.experience + " Years");
System.out.println("Fees : " + doctor32.fees);


Doctor doctor33 = new Doctor();
doctor33.doctorName = "Dr. Mohan Keshavamurthy And Team 2";
doctor33.designation = "Principal Director Urology | Fortis BG Road";
String[] specifications33 = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor33.specification = specifications33;
doctor33.experience = 25;
doctor33.fees = 1800;

System.out.println("=============== Thirty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor33.doctorName);
System.out.println("Designation : " + doctor33.designation);
System.out.println("Specifications :");
for(String special : doctor33.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor33.experience + " Years");
System.out.println("Fees : " + doctor33.fees);


Doctor doctor34 = new Doctor();
doctor34.doctorName = "Dr. Mohan Keshavamurthy And Team Clinic";
doctor34.designation = "Principal Director Urology | Fortis BG Road";
String[] specifications34 = {
    "Urology",
    "Paediatric Urology",
    "Uro-Oncology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor34.specification = specifications34;
doctor34.experience = 37;
doctor34.fees = 1800;

System.out.println("=============== Thirty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor34.doctorName);
System.out.println("Designation : " + doctor34.designation);
System.out.println("Specifications :");
for(String special : doctor34.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor34.experience + " Years");
System.out.println("Fees : " + doctor34.fees);


Doctor doctor35 = new Doctor();
doctor35.doctorName = "Dr. Mohit Agarwal";
doctor35.designation = "Principal Director & Head Medical Oncology | Fortis Shalimar Bagh";
String[] specifications35 = {
    "Oncology",
    "Medical Oncology"
};
doctor35.specification = specifications35;
doctor35.experience = 14;
doctor35.fees = 2000;

System.out.println("=============== Thirty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor35.doctorName);
System.out.println("Designation : " + doctor35.designation);
System.out.println("Specifications :");
for(String special : doctor35.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor35.experience + " Years");
System.out.println("Fees : " + doctor35.fees);

Doctor doctor36 = new Doctor();
doctor36.doctorName = "Dr. Narayan Hulse & Team";
doctor36.designation = "Principal Director & HOD - Orthopaedics | Fortis BG Road";
String[] specifications36 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer Navigated Joint Reconstruction"
};
doctor36.specification = specifications36;
doctor36.experience = 21;
doctor36.fees = 900;

System.out.println("=============== Thirty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor36.doctorName);
System.out.println("Designation : " + doctor36.designation);
System.out.println("Specifications :");
for(String special : doctor36.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor36.experience + " Years");
System.out.println("Fees : " + doctor36.fees);


Doctor doctor37 = new Doctor();
doctor37.doctorName = "Dr. Naresh Kumar Goyal";
doctor37.designation = "Principal Director & HOD Cardiology & Heart Failure Programme | Fortis Shalimar Bagh";
String[] specifications37 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor37.specification = specifications37;
doctor37.experience = 18;
doctor37.fees = 2100;

System.out.println("=============== Thirty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor37.doctorName);
System.out.println("Designation : " + doctor37.designation);
System.out.println("Specifications :");
for(String special : doctor37.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor37.experience + " Years");
System.out.println("Fees : " + doctor37.fees);


Doctor doctor38 = new Doctor();
doctor38.doctorName = "Dr. Nishith Chandra";
doctor38.designation = "Principal Director Cardiology | Fortis Okhla";
String[] specifications38 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor38.specification = specifications38;
doctor38.experience = 30;
doctor38.fees = 2000;

System.out.println("=============== Thirty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor38.doctorName);
System.out.println("Designation : " + doctor38.designation);
System.out.println("Specifications :");
for(String special : doctor38.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor38.experience + " Years");
System.out.println("Fees : " + doctor38.fees);


Doctor doctor39 = new Doctor();
doctor39.doctorName = "Dr. Nitesh Rohatgi";
doctor39.designation = "Principal Director Medical Oncology | FCI Defence Colony";
String[] specifications39 = {
    "Oncology",
    "Medical Oncology"
};
doctor39.specification = specifications39;
doctor39.experience = 15;
doctor39.fees = 3000;

System.out.println("=============== Fortieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor39.doctorName);
System.out.println("Designation : " + doctor39.designation);
System.out.println("Specifications :");
for(String special : doctor39.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor39.experience + " Years");
System.out.println("Fees : " + doctor39.fees);


Doctor doctor40 = new Doctor();
doctor40.doctorName = "Dr. Niti Raizada & Team - Dr Shruthi / Dr Varsha";
doctor40.designation = "Principal Director Medical Oncology | Fortis CG Road";
String[] specifications40 = {
    "Oncology",
    "Hemato-Oncology",
    "Medical Oncology"
};
doctor40.specification = specifications40;
doctor40.experience = 20;
doctor40.fees = 1400;

System.out.println("=============== Forty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor40.doctorName);
System.out.println("Designation : " + doctor40.designation);
System.out.println("Specifications :");
for(String special : doctor40.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor40.experience + " Years");
System.out.println("Fees : " + doctor40.fees);


Doctor doctor41 = new Doctor();
doctor41.doctorName = "Dr. Nityanand Tripathi";
doctor41.designation = "Principal Director & HOD Cardiology & Electrophysiology | Fortis Shalimar Bagh";
String[] specifications41 = {
    "Cardiac Sciences",
    "Electrophysiology",
    "Interventional Cardiology"
};
doctor41.specification = specifications41;
doctor41.experience = 21;
doctor41.fees = 2000;

System.out.println("=============== Forty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor41.doctorName);
System.out.println("Designation : " + doctor41.designation);
System.out.println("Specifications :");
for(String special : doctor41.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor41.experience + " Years");
System.out.println("Fees : " + doctor41.fees);


Doctor doctor42 = new Doctor();
doctor42.doctorName = "Dr. Parvathi UnniNayar Iyer";
doctor42.designation = "Principal Director Paediatrics | Fortis Okhla";
String[] specifications42 = {
    "Paediatrics",
    "Paediatric Cardiac Sciences"
};
doctor42.specification = specifications42;
doctor42.experience = 37;
doctor42.fees = 1500;

System.out.println("=============== Forty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor42.doctorName);
System.out.println("Designation : " + doctor42.designation);
System.out.println("Specifications :");
for(String special : doctor42.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor42.experience + " Years");
System.out.println("Fees : " + doctor42.fees);

Doctor doctor43 = new Doctor();
doctor43.doctorName = "Dr. Pradeep Kumar Jain";
doctor43.designation = "Chairman - GI, GI Oncology, Minimal Access & Bariatric Surgery | Fortis Shalimar Bagh";
String[] specifications43 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastrointestinal Surgery",
    "Metabolic & Bariatric Surgery",
    "Robotic Surgery",
    "GI Oncology",
    "General Surgery",
    "Laparoscopic Surgery",
    "Oncology"
};
doctor43.specification = specifications43;
doctor43.experience = 35;
doctor43.fees = 2500;

System.out.println("=============== Forty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor43.doctorName);
System.out.println("Designation : " + doctor43.designation);
System.out.println("Specifications :");
for(String special : doctor43.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor43.experience + " Years");
System.out.println("Fees : " + doctor43.fees);


Doctor doctor44 = new Doctor();
doctor44.doctorName = "Dr. Prashant Saxena";
doctor44.designation = "Principal Director - Pulmonology, Pulmonology Critical Care & Sleep Medicine | Fortis Vasant Kunj";
String[] specifications44 = {
    "Pulmonology",
    "Pulmonology and Critical Care",
    "Sleep Medicine"
};
doctor44.specification = specifications44;
doctor44.experience = 22;
doctor44.fees = 1800;

System.out.println("=============== Forty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor44.doctorName);
System.out.println("Designation : " + doctor44.designation);
System.out.println("Specifications :");
for(String special : doctor44.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor44.experience + " Years");
System.out.println("Fees : " + doctor44.fees);


Doctor doctor45 = new Doctor();
doctor45.doctorName = "Dr. Praveer Agarwal";
doctor45.designation = "Chairman Cardiology | Fortis Okhla";
String[] specifications45 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor45.specification = specifications45;
doctor45.experience = 30;
doctor45.fees = 2000;

System.out.println("=============== Forty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor45.doctorName);
System.out.println("Designation : " + doctor45.designation);
System.out.println("Specifications :");
for(String special : doctor45.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor45.experience + " Years");
System.out.println("Fees : " + doctor45.fees);


Doctor doctor46 = new Doctor();
doctor46.doctorName = "Dr. Rahul Bhargava";
doctor46.designation = "Principal Director & Chief - Hematology, Hemato Oncology & Bone Marrow Transplant | FMRI Gurgaon";
String[] specifications46 = {
    "Oncology",
    "Hemato-Oncology",
    "Organ Transplant",
    "Haematology and BMT",
    "Haematology"
};
doctor46.specification = specifications46;
doctor46.experience = 16;
doctor46.fees = 1200;

System.out.println("=============== Forty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor46.doctorName);
System.out.println("Designation : " + doctor46.designation);
System.out.println("Specifications :");
for(String special : doctor46.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor46.experience + " Years");
System.out.println("Fees : " + doctor46.fees);


Doctor doctor47 = new Doctor();
doctor47.doctorName = "Dr. Rahul Nagpal";
doctor47.designation = "Principal Director & HOD Paediatrics & Neonatology | Fortis Vasant Kunj";
String[] specifications47 = {
    "Paediatrics",
    "Neonatology"
};
doctor47.specification = specifications47;
doctor47.experience = 32;
doctor47.fees = 2400;

System.out.println("=============== Forty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor47.doctorName);
System.out.println("Designation : " + doctor47.designation);
System.out.println("Specifications :");
for(String special : doctor47.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor47.experience + " Years");
System.out.println("Fees : " + doctor47.fees);

Doctor doctor48 = new Doctor();
doctor48.doctorName = "Dr. Rajinder Yadav";
doctor48.designation = "Principal Director Urology | Fortis Shalimar Bagh";
String[] specifications48 = {
    "Urology",
    "Kidney Transplant",
    "Uro-Oncology",
    "Robotic Surgery",
    "Organ Transplant"
};
doctor48.specification = specifications48;
doctor48.experience = 42;
doctor48.fees = 2000;

System.out.println("=============== Forty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor48.doctorName);
System.out.println("Designation : " + doctor48.designation);
System.out.println("Specifications :");
for(String special : doctor48.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor48.experience + " Years");
System.out.println("Fees : " + doctor48.fees);


Doctor doctor49 = new Doctor();
doctor49.doctorName = "Dr. Rakesh Kumar Gupta";
doctor49.designation = "Principal Director Radiology | FMRI Gurgaon";
String[] specifications49 = {
    "Radiology"
};
doctor49.specification = specifications49;
doctor49.experience = 35;
doctor49.fees = 2000;

System.out.println("=============== Fiftieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor49.doctorName);
System.out.println("Designation : " + doctor49.designation);
System.out.println("Specifications :");
for(String special : doctor49.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor49.experience + " Years");
System.out.println("Fees : " + doctor49.fees);


Doctor doctor50 = new Doctor();
doctor50.doctorName = "Dr. Rakesh Kumar Dua";
doctor50.designation = "Principal Director & HOD Neuro and Spine Surgery | Fortis Shalimar Bagh";
String[] specifications50 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor50.specification = specifications50;
doctor50.experience = 25;
doctor50.fees = 2000;

System.out.println("=============== Fifty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor50.doctorName);
System.out.println("Designation : " + doctor50.designation);
System.out.println("Specifications :");
for(String special : doctor50.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor50.experience + " Years");
System.out.println("Fees : " + doctor50.fees);


Doctor doctor51 = new Doctor();
doctor51.doctorName = "Dr. Rama Joshi";
doctor51.designation = "Chairman - Gynae Oncology and Robotic Surgery | FMRI Gurgaon";
String[] specifications51 = {
    "Oncology",
    "Gynaecologic Oncology"
};
doctor51.specification = specifications51;
doctor51.experience = 30;
doctor51.fees = 2000;

System.out.println("=============== Fifty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor51.doctorName);
System.out.println("Designation : " + doctor51.designation);
System.out.println("Specifications :");
for(String special : doctor51.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor51.experience + " Years");
System.out.println("Fees : " + doctor51.fees);


Doctor doctor52 = new Doctor();
doctor52.doctorName = "Dr. Rana Patir";
doctor52.designation = "Chairman Neuro Surgery | FMRI Gurgaon";
String[] specifications52 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor52.specification = specifications52;
doctor52.experience = 32;
doctor52.fees = 2000;

System.out.println("=============== Fifty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor52.doctorName);
System.out.println("Designation : " + doctor52.designation);
System.out.println("Specifications :");
for(String special : doctor52.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor52.experience + " Years");
System.out.println("Fees : " + doctor52.fees);


Doctor doctor53 = new Doctor();
doctor53.doctorName = "Dr. Sandeep Vaishya";
doctor53.designation = "Executive Director & HOD Neuro Surgery | FMRI Gurgaon";
String[] specifications53 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor53.specification = specifications53;
doctor53.experience = 30;
doctor53.fees = 2000;

System.out.println("=============== Fifty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor53.doctorName);
System.out.println("Designation : " + doctor53.designation);
System.out.println("Specifications :");
for(String special : doctor53.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor53.experience + " Years");
System.out.println("Fees : " + doctor53.fees);


Doctor doctor54 = new Doctor();
doctor54.doctorName = "Dr. Salil Jain";
doctor54.designation = "Principal Director & HOD Nephrology | FMRI Gurgaon";
String[] specifications54 = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology"
};
doctor54.specification = specifications54;
doctor54.experience = 25;
doctor54.fees = 2200;

System.out.println("=============== Fifty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor54.doctorName);
System.out.println("Designation : " + doctor54.designation);
System.out.println("Specifications :");
for(String special : doctor54.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor54.experience + " Years");
System.out.println("Fees : " + doctor54.fees);

Doctor doctor55 = new Doctor();
doctor55.doctorName = "Dr. Sanjeev Gulati";
doctor55.designation = "Chairman - Nephrology | Fortis Vasant Kunj";
String[] specifications55 = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology"
};
doctor55.specification = specifications55;
doctor55.experience = 30;
doctor55.fees = 2200;

System.out.println("=============== Fifty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor55.doctorName);
System.out.println("Designation : " + doctor55.designation);
System.out.println("Specifications :");
for(String special : doctor55.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor55.experience + " Years");
System.out.println("Fees : " + doctor55.fees);


Doctor doctor56 = new Doctor();
doctor56.doctorName = "Dr. Sanjeev Gulati";
doctor56.designation = "Chairman - Nephrology | Fortis Okhla";
String[] specifications56 = {
    "Organ Transplant",
    "Kidney Transplant",
    "Nephrology"
};
doctor56.specification = specifications56;
doctor56.experience = 31;
doctor56.fees = 2000;

System.out.println("=============== Fifty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor56.doctorName);
System.out.println("Designation : " + doctor56.designation);
System.out.println("Specifications :");
for(String special : doctor56.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor56.experience + " Years");
System.out.println("Fees : " + doctor56.fees);


Doctor doctor57 = new Doctor();
doctor57.doctorName = "Dr. Satish Koul";
doctor57.designation = "Principal Director & Unit Head - Internal Medicine | FMRI Gurgaon";
String[] specifications57 = {
    "Internal Medicine",
    "General Physician"
};
doctor57.specification = specifications57;
doctor57.experience = 22;
doctor57.fees = 1800;

System.out.println("=============== Fifty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor57.doctorName);
System.out.println("Designation : " + doctor57.designation);
System.out.println("Specifications :");
for(String special : doctor57.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor57.experience + " Years");
System.out.println("Fees : " + doctor57.fees);


Doctor doctor58 = new Doctor();
doctor58.doctorName = "Dr. Shiv Kumar Choudhary";
doctor58.designation = "Executive Director Cardio Thoracic Vascular Surgery | Fortis Okhla";
String[] specifications58 = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor58.specification = specifications58;
doctor58.experience = 33;
doctor58.fees = 2000;

System.out.println("=============== Fifty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor58.doctorName);
System.out.println("Designation : " + doctor58.designation);
System.out.println("Specifications :");
for(String special : doctor58.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor58.experience + " Years");
System.out.println("Fees : " + doctor58.fees);


Doctor doctor59 = new Doctor();
doctor59.doctorName = "Dr. Sonal Gupta";
doctor59.designation = "Principal Director & HOD Neuro and Spine Surgery | Fortis Shalimar Bagh";
String[] specifications59 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor59.specification = specifications59;
doctor59.experience = 28;
doctor59.fees = 2000;

System.out.println("=============== Sixtieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor59.doctorName);
System.out.println("Designation : " + doctor59.designation);
System.out.println("Specifications :");
for(String special : doctor59.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor59.experience + " Years");
System.out.println("Fees : " + doctor59.fees);


Doctor doctor60 = new Doctor();
doctor60.doctorName = "Dr. Subhash Jangid";
doctor60.designation = "Principal Director & Unit Head Orthopaedics | FMRI Gurgaon";
String[] specifications60 = {
    "Orthopaedics",
    "Sports Medicine",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer Navigated Joint Reconstruction",
    "Orthopaedic Oncology"
};
doctor60.specification = specifications60;
doctor60.experience = 27;
doctor60.fees = 2500;

System.out.println("=============== Sixtieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor60.doctorName);
System.out.println("Designation : " + doctor60.designation);
System.out.println("Specifications :");
for(String special : doctor60.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor60.experience + " Years");
System.out.println("Fees : " + doctor60.fees);


Doctor doctor61 = new Doctor();
doctor61.doctorName = "Dr. Subrat Kumar Acharya";
doctor61.designation = "Executive Director Gastroenterology | Fortis Okhla";
String[] specifications61 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology",
    "Hepatobiliary Sciences"
};
doctor61.specification = specifications61;
doctor61.experience = 42;
doctor61.fees = 2500;

System.out.println("=============== Sixty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor61.doctorName);
System.out.println("Designation : " + doctor61.designation);
System.out.println("Specifications :");
for(String special : doctor61.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor61.experience + " Years");
System.out.println("Fees : " + doctor61.fees);


Doctor doctor62 = new Doctor();
doctor62.doctorName = "Dr. Tripat Choudhary";
doctor62.designation = "Principal Director Obstetrics & Gynaecology | Fortis La Femme GK II";
String[] specifications62 = {
    "Obstetrics and Gynaecology"
};
doctor62.specification = specifications62;
doctor62.experience = 43;
doctor62.fees = 3000;

System.out.println("=============== Sixty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor62.doctorName);
System.out.println("Designation : " + doctor62.designation);
System.out.println("Specifications :");
for(String special : doctor62.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor62.experience + " Years");
System.out.println("Fees : " + doctor62.fees);


Doctor doctor63 = new Doctor();
doctor63.doctorName = "Dr. Udgeath Dhir";
doctor63.designation = "Principal Director Cardio Thoracic Vascular Surgery | FMRI Gurgaon";
String[] specifications63 = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)",
    "Heart Transplant",
    "Organ Transplant"
};
doctor63.specification = specifications63;
doctor63.experience = 18;
doctor63.fees = 2000;

System.out.println("=============== Sixty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor63.doctorName);
System.out.println("Designation : " + doctor63.designation);
System.out.println("Specifications :");
for(String special : doctor63.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor63.experience + " Years");
System.out.println("Fees : " + doctor63.fees);


Doctor doctor64 = new Doctor();
doctor64.doctorName = "Dr. Vedant Kabra";
doctor64.designation = "Principal Director Surgical Oncology | FMRI Gurgaon";
String[] specifications64 = {
    "Oncology",
    "Surgical Oncology",
    "Robotic Surgery",
    "Breast Oncology"
};
doctor64.specification = specifications64;
doctor64.experience = 25;
doctor64.fees = 2500;

System.out.println("=============== Sixty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor64.doctorName);
System.out.println("Designation : " + doctor64.designation);
System.out.println("Specifications :");
for(String special : doctor64.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor64.experience + " Years");
System.out.println("Fees : " + doctor64.fees);


Doctor doctor65 = new Doctor();
doctor65.doctorName = "Dr. Vikas Dua";
doctor65.designation = "Principal Director & Head - Pediatric Hematology, Hemato Oncology & Bone Marrow Transplant | FMRI Gurgaon";
String[] specifications65 = {
    "Organ Transplant",
    "Haematology and BMT",
    "Paediatric Haematology and BMT",
    "Oncology",
    "Hemato-Oncology",
    "Paediatrics",
    "Paediatric Oncology"
};
doctor65.specification = specifications65;
doctor65.experience = 15;
doctor65.fees = 1200;

System.out.println("=============== Sixty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor65.doctorName);
System.out.println("Designation : " + doctor65.designation);
System.out.println("Specifications :");
for(String special : doctor65.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor65.experience + " Years");
System.out.println("Fees : " + doctor65.fees);


Doctor doctor66 = new Doctor();
doctor66.doctorName = "Dr. Vinayak Agrawal";
doctor66.designation = "Principal Director & Head Non Invasive Cardiology | FMRI Gurgaon";
String[] specifications66 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor66.specification = specifications66;
doctor66.experience = 25;
doctor66.fees = 1800;

System.out.println("=============== Sixty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor66.doctorName);
System.out.println("Designation : " + doctor66.designation);
System.out.println("Specifications :");
for(String special : doctor66.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor66.experience + " Years");
System.out.println("Fees : " + doctor66.fees);


Doctor doctor67 = new Doctor();
doctor67.doctorName = "Dr. Vinod Raina";
doctor67.designation = "Chairman Oncosciences | FMRI Gurgaon";
String[] specifications67 = {
    "Oncology",
    "Medical Oncology"
};
doctor67.specification = specifications67;
doctor67.experience = 40;
doctor67.fees = 3000;

System.out.println("=============== Sixty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor67.doctorName);
System.out.println("Designation : " + doctor67.designation);
System.out.println("Specifications :");
for(String special : doctor67.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor67.experience + " Years");
System.out.println("Fees : " + doctor67.fees);


Doctor doctor68 = new Doctor();
doctor68.doctorName = "Dr. Vivek Vij";
doctor68.designation = "Chairman - Liver Transplant & Hepato-Biliary Science | Fortis Noida";
String[] specifications68 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Robotic Surgery",
    "Liver Transplant and Hepatobiliary Sciences",
    "Liver Transplant",
    "Organ Transplant"
};
doctor68.specification = specifications68;
doctor68.experience = 25;
doctor68.fees = 2500;

System.out.println("=============== Sixty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor68.doctorName);
System.out.println("Designation : " + doctor68.designation);
System.out.println("Specifications :");
for(String special : doctor68.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor68.experience + " Years");
System.out.println("Fees : " + doctor68.fees);


Doctor doctor69 = new Doctor();
doctor69.doctorName = "Dr. Z S Meharwal";
doctor69.designation = "Chairman & Head - Adult Cardiac Surgery | Fortis Okhla";
String[] specifications69 = {
    "Cardiac Sciences",
    "Heart Transplant",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor69.specification = specifications69;
doctor69.experience = 38;
doctor69.fees = 2000;

System.out.println("=============== Sixty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor69.doctorName);
System.out.println("Designation : " + doctor69.designation);
System.out.println("Specifications :");
for(String special : doctor69.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor69.experience + " Years");
System.out.println("Fees : " + doctor69.fees);


Doctor doctor70 = new Doctor();
doctor70.doctorName = "Dr. Amitabh Parti";
doctor70.designation = "Senior Director & Unit Head - Internal Medicine | FMRI Gurgaon";
String[] specifications70 = {
    "Internal Medicine",
    "General Physician"
};
doctor70.specification = specifications70;
doctor70.experience = 32;
doctor70.fees = 2000;

System.out.println("=============== Seventieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor70.doctorName);
System.out.println("Designation : " + doctor70.designation);
System.out.println("Specifications :");
for(String special : doctor70.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor70.experience + " Years");
System.out.println("Fees : " + doctor70.fees);


Doctor doctor71 = new Doctor();
doctor71.doctorName = "Dr. Anoop Jhurani";
doctor71.designation = "Senior Director & HOD Orthopaedics | Fortis Jaipur";
String[] specifications71 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer Navigated Joint Reconstruction"
};
doctor71.specification = specifications71;
doctor71.experience = 26;
doctor71.fees = 1500;

System.out.println("=============== Seventy First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor71.doctorName);
System.out.println("Designation : " + doctor71.designation);
System.out.println("Specifications :");
for(String special : doctor71.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor71.experience + " Years");
System.out.println("Fees : " + doctor71.fees);

Doctor doctor72 = new Doctor();
doctor72.doctorName = "Dr. Anuj Chawla";
doctor72.designation = "Senior Director Orthopaedics | Fortis Okhla";
String[] specifications72 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Orthopaedics and Spine Surgery",
    "Sports Medicine"
};
doctor72.specification = specifications72;
doctor72.experience = 21;
doctor72.fees = 1500;

System.out.println("=============== Seventy Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor72.doctorName);
System.out.println("Designation : " + doctor72.designation);
System.out.println("Specifications :");
for(String special : doctor72.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor72.experience + " Years");
System.out.println("Fees : " + doctor72.fees);


Doctor doctor73 = new Doctor();
doctor73.doctorName = "Dr. Arun Agarwal";
doctor73.designation = "Senior Director & HOD Internal Medicine | Fortis Jaipur";
String[] specifications73 = {
    "Internal Medicine"
};
doctor73.specification = specifications73;
doctor73.experience = 36;
doctor73.fees = 0;   // Fee not visible in screenshot

System.out.println("=============== Seventy Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor73.doctorName);
System.out.println("Designation : " + doctor73.designation);
System.out.println("Specifications :");
for(String special : doctor73.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor73.experience + " Years");
System.out.println("Fees : " + doctor73.fees);


Doctor doctor74 = new Doctor();
doctor74.doctorName = "Dr. Brahm Datt Pathak";
doctor74.designation = "Senior Director - GI, Minimal Access & Bariatric Surgery | Fortis Faridabad";
String[] specifications74 = {
    "General Surgery"
};
doctor74.specification = specifications74;
doctor74.experience = 34;
doctor74.fees = 700;

System.out.println("=============== Seventy Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor74.doctorName);
System.out.println("Designation : " + doctor74.designation);
System.out.println("Specifications :");
for(String special : doctor74.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor74.experience + " Years");
System.out.println("Fees : " + doctor74.fees);


Doctor doctor75 = new Doctor();
doctor75.doctorName = "Dr. Debashish Chanda";
doctor75.designation = "Senior Director & Unit Head Orthopaedics | FMRI Gurgaon";
String[] specifications75 = {
    "Orthopaedics",
    "Robotic and Computer Navigated Joint Reconstruction",
    "Orthopaedics and Joint Replacement",
    "Orthopaedic Oncology"
};
doctor75.specification = specifications75;
doctor75.experience = 22;
doctor75.fees = 2000;

System.out.println("=============== Seventy Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor75.doctorName);
System.out.println("Designation : " + doctor75.designation);
System.out.println("Specifications :");
for(String special : doctor75.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor75.experience + " Years");
System.out.println("Fees : " + doctor75.fees);


Doctor doctor76 = new Doctor();
doctor76.doctorName = "Dr. Deepak Kalra";
doctor76.designation = "Senior Director & HOD Nephrology | Fortis Shalimar Bagh";
String[] specifications76 = {
    "Nephrology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor76.specification = specifications76;
doctor76.experience = 18;
doctor76.fees = 1500;

System.out.println("=============== Seventy Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor76.doctorName);
System.out.println("Designation : " + doctor76.designation);
System.out.println("Specifications :");
for(String special : doctor76.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor76.experience + " Years");
System.out.println("Fees : " + doctor76.fees);


Doctor doctor77 = new Doctor();
doctor77.doctorName = "Dr. Dhananjay Gupta";
doctor77.designation = "Senior Director Orthopaedics | Fortis Vasant Kunj";
String[] specifications77 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement"
};
doctor77.specification = specifications77;
doctor77.experience = 28;
doctor77.fees = 1800;

System.out.println("=============== Seventy Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor77.doctorName);
System.out.println("Designation : " + doctor77.designation);
System.out.println("Specifications :");
for(String special : doctor77.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor77.experience + " Years");
System.out.println("Fees : " + doctor77.fees);


Doctor doctor78 = new Doctor();
doctor78.doctorName = "Dr. Dinesh Gupta";
doctor78.designation = "Senior Director Internal Medicine | Fortis Ludhiana";
String[] specifications78 = {
    "Internal Medicine",
    "General Physician"
};
doctor78.specification = specifications78;
doctor78.experience = 31;
doctor78.fees = 1000;

System.out.println("=============== Seventy Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor78.doctorName);
System.out.println("Designation : " + doctor78.designation);
System.out.println("Specifications :");
for(String special : doctor78.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor78.experience + " Years");
System.out.println("Fees : " + doctor78.fees);

Doctor doctor79 = new Doctor();
doctor79.doctorName = "Dr. Dinesh Kumar Mittal";
doctor79.designation = "Senior Director & HOD Cardiothoracic and Vascular Surgery | Fortis Shalimar Bagh";
String[] specifications79 = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor79.specification = specifications79;
doctor79.experience = 20;
doctor79.fees = 1500;

System.out.println("=============== Seventy Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor79.doctorName);
System.out.println("Designation : " + doctor79.designation);
System.out.println("Specifications :");
for(String special : doctor79.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor79.experience + " Years");
System.out.println("Fees : " + doctor79.fees);


Doctor doctor80 = new Doctor();
doctor80.doctorName = "Dr. Harjit Singh Mahay";
doctor80.designation = "Senior Director Critical Care | Fortis Shalimar Bagh";
String[] specifications80 = {
    "Intensive Care and Critical Care",
    "Critical Care"
};
doctor80.specification = specifications80;
doctor80.experience = 27;
doctor80.fees = 0;

System.out.println("=============== Eightieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor80.doctorName);
System.out.println("Designation : " + doctor80.designation);
System.out.println("Specifications :");
for(String special : doctor80.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor80.experience + " Years");
System.out.println("Fees : " + doctor80.fees);


Doctor doctor81 = new Doctor();
doctor81.doctorName = "Dr. Harminder Singh Pannu";
doctor81.designation = "Senior Director Internal Medicine | Fortis Mall Road";
String[] specifications81 = {
    "General Physician",
    "Internal Medicine"
};
doctor81.specification = specifications81;
doctor81.experience = 31;
doctor81.fees = 1000;

System.out.println("=============== Eighty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor81.doctorName);
System.out.println("Designation : " + doctor81.designation);
System.out.println("Specifications :");
for(String special : doctor81.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor81.experience + " Years");
System.out.println("Fees : " + doctor81.fees);


Doctor doctor82 = new Doctor();
doctor82.doctorName = "Dr. Hemant Bhartiya";
doctor82.designation = "Senior Director & HOD Neuro and Spine Surgery | Fortis Jaipur";
String[] specifications82 = {
    "Neurosurgery"
};
doctor82.specification = specifications82;
doctor82.experience = 31;
doctor82.fees = 1500;

System.out.println("=============== Eighty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor82.doctorName);
System.out.println("Designation : " + doctor82.designation);
System.out.println("Specifications :");
for(String special : doctor82.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor82.experience + " Years");
System.out.println("Fees : " + doctor82.fees);


Doctor doctor83 = new Doctor();
doctor83.doctorName = "Dr. J. M. S. Kalra";
doctor83.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String[] specifications83 = {
    "Internal Medicine",
    "Geriatric Medicine",
    "General Physician"
};
doctor83.specification = specifications83;
doctor83.experience = 46;
doctor83.fees = 1500;

System.out.println("=============== Eighty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor83.doctorName);
System.out.println("Designation : " + doctor83.designation);
System.out.println("Specifications :");
for(String special : doctor83.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor83.experience + " Years");
System.out.println("Fees : " + doctor83.fees);

Doctor doctor84 = new Doctor();
doctor84.doctorName = "Dr. Murali R Chakravarthy";
doctor84.designation = "Senior Director Anaesthesia | Fortis BG Road";
String[] specifications84 = {
    "Support Specialities",
    "Anaesthesia"
};
doctor84.specification = specifications84;
doctor84.experience = 34;
doctor84.fees = 900;

System.out.println("=============== Eighty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor84.doctorName);
System.out.println("Designation : " + doctor84.designation);
System.out.println("Specifications :");
for(String special : doctor84.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor84.experience + " Years");
System.out.println("Fees : " + doctor84.fees);


Doctor doctor85 = new Doctor();
doctor85.doctorName = "Dr. N.C. Krishnamani";
doctor85.designation = "Senior Director Cardiology | Fortis Shalimar Bagh";
String[] specifications85 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor85.specification = specifications85;
doctor85.experience = 28;
doctor85.fees = 2000;

System.out.println("=============== Eighty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor85.doctorName);
System.out.println("Designation : " + doctor85.designation);
System.out.println("Specifications :");
for(String special : doctor85.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor85.experience + " Years");
System.out.println("Fees : " + doctor85.fees);


Doctor doctor86 = new Doctor();
doctor86.doctorName = "Dr. Neeraj Chaudhary";
doctor86.designation = "Senior Director & HOD - GI, GI Oncology, Minimal Access & Bariatric Surgery | Fortis Vasant Kunj";
String[] specifications86 = {
    "General Surgery",
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery"
};
doctor86.specification = specifications86;
doctor86.experience = 20;
doctor86.fees = 1500;

System.out.println("=============== Eighty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor86.doctorName);
System.out.println("Designation : " + doctor86.designation);
System.out.println("Specifications :");
for(String special : doctor86.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor86.experience + " Years");
System.out.println("Fees : " + doctor86.fees);


Doctor doctor87 = new Doctor();
doctor87.doctorName = "Dr. Nikhil Kumar";
doctor87.designation = "Senior Director Cardiology | FMRI Gurgaon";
String[] specifications87 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor87.specification = specifications87;
doctor87.experience = 39;
doctor87.fees = 2000;

System.out.println("=============== Eighty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor87.doctorName);
System.out.println("Designation : " + doctor87.designation);
System.out.println("Specifications :");
for(String special : doctor87.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor87.experience + " Years");
System.out.println("Fees : " + doctor87.fees);


Doctor doctor88 = new Doctor();
doctor88.doctorName = "Dr. Nitika Sobti";
doctor88.designation = "Senior Director Obstetrics & Gynaecology | FMRI Gurgaon";
String[] specifications88 = {
    "Obstetrics and Gynaecology"
};
doctor88.specification = specifications88;
doctor88.experience = 28;
doctor88.fees = 1800;

System.out.println("=============== Eighty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor88.doctorName);
System.out.println("Designation : " + doctor88.designation);
System.out.println("Specifications :");
for(String special : doctor88.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor88.experience + " Years");
System.out.println("Fees : " + doctor88.fees);


Doctor doctor89 = new Doctor();
doctor89.doctorName = "Dr. Pankaj Kumar";
doctor89.designation = "Senior Director Critical Care | Fortis Shalimar Bagh";
String[] specifications89 = {
    "Critical Care",
    "Intensive Care and Critical Care"
};
doctor89.specification = specifications89;
doctor89.experience = 27;
doctor89.fees = 0;   // Fee not visible in screenshot

System.out.println("=============== Eighty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor89.doctorName);
System.out.println("Designation : " + doctor89.designation);
System.out.println("Specifications :");
for(String special : doctor89.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor89.experience + " Years");
System.out.println("Fees : " + doctor89.fees);


Doctor doctor90 = new Doctor();
doctor90.doctorName = "Dr. Pawan Kumar Goyal";
doctor90.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String[] specifications90 = {
    "Internal Medicine",
    "General Physician",
    "Geriatric Medicine"
};
doctor90.specification = specifications90;
doctor90.experience = 32;
doctor90.fees = 1500;

System.out.println("=============== Ninetieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor90.doctorName);
System.out.println("Designation : " + doctor90.designation);
System.out.println("Specifications :");
for(String special : doctor90.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor90.experience + " Years");
System.out.println("Fees : " + doctor90.fees);

Doctor doctor91 = new Doctor();
doctor91.doctorName = "Dr. R. Tongia";
doctor91.designation = "Senior Director & HOD Cardiology | Fortis Jaipur";
String[] specifications91 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor91.specification = specifications91;
doctor91.experience = 53;
doctor91.fees = 700;

System.out.println("=============== Ninety First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor91.doctorName);
System.out.println("Designation : " + doctor91.designation);
System.out.println("Specifications :");
for(String special : doctor91.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor91.experience + " Years");
System.out.println("Fees : " + doctor91.fees);


Doctor doctor92 = new Doctor();
doctor92.doctorName = "Dr. Rahul Gupta - Neurosurgery";
doctor92.designation = "Senior Director & HOD Neuro and Spine Surgery | Fortis Noida";
String[] specifications92 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor92.specification = specifications92;
doctor92.experience = 20;
doctor92.fees = 1200;

System.out.println("=============== Ninety Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor92.doctorName);
System.out.println("Designation : " + doctor92.designation);
System.out.println("Specifications :");
for(String special : doctor92.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor92.experience + " Years");
System.out.println("Fees : " + doctor92.fees);


Doctor doctor93 = new Doctor();
doctor93.doctorName = "Dr. Rajesh Kumar Budhiraja";
doctor93.designation = "Senior Director Internal Medicine | Fortis Faridabad";
String[] specifications93 = {
    "Internal Medicine",
    "General Physician"
};
doctor93.specification = specifications93;
doctor93.experience = 20;
doctor93.fees = 800;

System.out.println("=============== Ninety Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor93.doctorName);
System.out.println("Designation : " + doctor93.designation);
System.out.println("Specifications :");
for(String special : doctor93.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor93.experience + " Years");
System.out.println("Fees : " + doctor93.fees);


Doctor doctor94 = new Doctor();
doctor94.doctorName = "Dr. Rajoo Singh Chhina";
doctor94.designation = "Senior Director & HOD Gastroenterology | Fortis Ludhiana";
String[] specifications94 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology"
};
doctor94.specification = specifications94;
doctor94.experience = 44;
doctor94.fees = 1000;

System.out.println("=============== Ninety Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor94.doctorName);
System.out.println("Designation : " + doctor94.designation);
System.out.println("Specifications :");
for(String special : doctor94.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor94.experience + " Years");
System.out.println("Fees : " + doctor94.fees);


Doctor doctor95 = new Doctor();
doctor95.doctorName = "Dr. Rakesh Sood";
doctor95.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String[] specifications95 = {
    "Internal Medicine"
};
doctor95.specification = specifications95;
doctor95.experience = 37;
doctor95.fees = 1500;

System.out.println("=============== Ninety Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor95.doctorName);
System.out.println("Designation : " + doctor95.designation);
System.out.println("Specifications :");
for(String special : doctor95.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor95.experience + " Years");
System.out.println("Fees : " + doctor95.fees);

Doctor doctor96 = new Doctor();
doctor96.doctorName = "Dr. Ramesh Garg";
doctor96.designation = "Senior Director & HOD Gastroenterology | Fortis Shalimar Bagh";
String[] specifications96 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology"
};
doctor96.specification = specifications96;
doctor96.experience = 25;
doctor96.fees = 1500;

System.out.println("=============== Ninety Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor96.doctorName);
System.out.println("Designation : " + doctor96.designation);
System.out.println("Specifications :");
for(String special : doctor96.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor96.experience + " Years");
System.out.println("Fees : " + doctor96.fees);


Doctor doctor97 = new Doctor();
doctor97.doctorName = "Dr. Richie Gupta";
doctor97.designation = "Senior Director & HOD Plastic Surgery | Fortis Shalimar Bagh";
String[] specifications97 = {
    "Plastic and Reconstructive Surgery"
};
doctor97.specification = specifications97;
doctor97.experience = 30;
doctor97.fees = 2000;

System.out.println("=============== Ninety Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor97.doctorName);
System.out.println("Designation : " + doctor97.designation);
System.out.println("Specifications :");
for(String special : doctor97.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor97.experience + " Years");
System.out.println("Fees : " + doctor97.fees);


Doctor doctor98 = new Doctor();
doctor98.doctorName = "Dr. Sandeep Dewan";
doctor98.designation = "Senior Director & HOD - Critical Care | FMRI Gurgaon";
String[] specifications98 = {
    "Critical Care"
};
doctor98.specification = specifications98;
doctor98.experience = 24;
doctor98.fees = 2000;

System.out.println("=============== Ninety Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor98.doctorName);
System.out.println("Designation : " + doctor98.designation);
System.out.println("Specifications :");
for(String special : doctor98.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor98.experience + " Years");
System.out.println("Fees : " + doctor98.fees);


Doctor doctor99 = new Doctor();
doctor99.doctorName = "Dr. Sanjay Kumar";
doctor99.designation = "Senior Director Cardiology | Fortis Faridabad";
String[] specifications99 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor99.specification = specifications99;
doctor99.experience = 26;
doctor99.fees = 1000;

System.out.println("=============== Ninety Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor99.doctorName);
System.out.println("Designation : " + doctor99.designation);
System.out.println("Specifications :");
for(String special : doctor99.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor99.experience + " Years");
System.out.println("Fees : " + doctor99.fees);


Doctor doctor100 = new Doctor();
doctor100.doctorName = "Dr. Sanjay Kumar Gogia";
doctor100.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String[] specifications100 = {
    "Internal Medicine",
    "General Physician",
    "Geriatric Medicine"
};
doctor100.specification = specifications100;
doctor100.experience = 30;
doctor100.fees = 1400;

System.out.println("=============== One Hundredth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor100.doctorName);
System.out.println("Designation : " + doctor100.designation);
System.out.println("Specifications :");
for(String special : doctor100.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor100.experience + " Years");
System.out.println("Fees : " + doctor100.fees);


Doctor doctor101 = new Doctor();
doctor101.doctorName = "Dr. Sanjeev Gera";
doctor101.designation = "Senior Director & HOD Cardiology | Fortis Noida";
String[] specifications101 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor101.specification = specifications101;
doctor101.experience = 22;
doctor101.fees = 1200;

System.out.println("=============== One Hundred First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor101.doctorName);
System.out.println("Designation : " + doctor101.designation);
System.out.println("Specifications :");
for(String special : doctor101.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor101.experience + " Years");
System.out.println("Fees : " + doctor101.fees);


Doctor doctor102 = new Doctor();
doctor102.doctorName = "Dr. Sanjeev Mahajan";
doctor102.designation = "Senior Director Orthopaedics | Fortis Ludhiana";
String[] specifications102 = {
    "Orthopaedics",
    "Paediatric Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Robotic and Computer Navigated Joint Reconstruction",
    "Sports Medicine"
};
doctor102.specification = specifications102;
doctor102.experience = 30;
doctor102.fees = 1000;

System.out.println("=============== One Hundred Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor102.doctorName);
System.out.println("Designation : " + doctor102.designation);
System.out.println("Specifications :");
for(String special : doctor102.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor102.experience + " Years");
System.out.println("Fees : " + doctor102.fees);

Doctor doctor103 = new Doctor();
doctor103.doctorName = "Dr. Sanjeevani Khanna";
doctor103.designation = "Senior Director - Emeritus Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String[] specifications103 = {
    "Obstetrics and Gynaecology"
};
doctor103.specification = specifications103;
doctor103.experience = 37;
doctor103.fees = 2000;

System.out.println("=============== One Hundred Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor103.doctorName);
System.out.println("Designation : " + doctor103.designation);
System.out.println("Specifications :");
for(String special : doctor103.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor103.experience + " Years");
System.out.println("Fees : " + doctor103.fees);


Doctor doctor104 = new Doctor();
doctor104.doctorName = "Dr. Shubham Jain";
doctor104.designation = "Senior Director Surgical Oncology | FCI Defence Colony";
String[] specifications104 = {
    "Oncology",
    "Surgical Oncology",
    "Head and Neck Oncosurgery",
    "Gynaecologic Oncology",
    "Gastroenterology and Hepatobiliary Sciences",
    "Robotic Surgery",
    "Thoracic Surgery",
    "Thoracic Oncology",
    "Paediatrics",
    "Paediatric Oncology"
};
doctor104.specification = specifications104;
doctor104.experience = 11;
doctor104.fees = 2000;

System.out.println("=============== One Hundred Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor104.doctorName);
System.out.println("Designation : " + doctor104.designation);
System.out.println("Specifications :");
for(String special : doctor104.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor104.experience + " Years");
System.out.println("Fees : " + doctor104.fees);


Doctor doctor105 = new Doctor();
doctor105.doctorName = "Dr. Shyam Sunder Sharma";
doctor105.designation = "Senior Director & HOD Gastroenterology | Fortis Jaipur";
String[] specifications105 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "GI Oncology",
    "Gastroenterology"
};
doctor105.specification = specifications105;
doctor105.experience = 35;
doctor105.fees = 1500;

System.out.println("=============== One Hundred Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor105.doctorName);
System.out.println("Designation : " + doctor105.designation);
System.out.println("Specifications :");
for(String special : doctor105.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor105.experience + " Years");
System.out.println("Fees : " + doctor105.fees);


Doctor doctor106 = new Doctor();
doctor106.doctorName = "Dr. Suneeta Mittal";
doctor106.designation = "Senior Director & HOD Obstetrics & Gynaecology | FMRI Gurgaon";
String[] specifications106 = {
    "Obstetrics and Gynaecology",
    "Robotic Surgery"
};
doctor106.specification = specifications106;
doctor106.experience = 57;
doctor106.fees = 2500;

System.out.println("=============== One Hundred Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor106.doctorName);
System.out.println("Designation : " + doctor106.designation);
System.out.println("Specifications :");
for(String special : doctor106.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor106.experience + " Years");
System.out.println("Fees : " + doctor106.fees);


Doctor doctor107 = new Doctor();
doctor107.doctorName = "Dr. Sunita Varma";
doctor107.designation = "Senior Director & HOD Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String[] specifications107 = {
    "Obstetrics and Gynaecology",
    "Robotic Surgery"
};
doctor107.specification = specifications107;
doctor107.experience = 30;
doctor107.fees = 2000;

System.out.println("=============== One Hundred Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor107.doctorName);
System.out.println("Designation : " + doctor107.designation);
System.out.println("Specifications :");
for(String special : doctor107.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor107.experience + " Years");
System.out.println("Fees : " + doctor107.fees);

Doctor doctor108 = new Doctor();
doctor108.doctorName = "Dr. Tapan Ghose";
doctor108.designation = "Senior Director & HOD Cardiology | Fortis Vasant Kunj";
String[] specifications108 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology",
    "Interventional Cardiology"
};
doctor108.specification = specifications108;
doctor108.experience = 30;
doctor108.fees = 1350;

System.out.println("=============== One Hundred Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor108.doctorName);
System.out.println("Designation : " + doctor108.designation);
System.out.println("Specifications :");
for(String special : doctor108.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor108.experience + " Years");
System.out.println("Fees : " + doctor108.fees);


Doctor doctor109 = new Doctor();
doctor109.doctorName = "Dr. Umesh Deshmukh";
doctor109.designation = "Senior Director & HOD Anaesthesiology | Fortis Shalimar Bagh";
String[] specifications109 = {
    "Support Specialities",
    "Anaesthesia"
};
doctor109.specification = specifications109;
doctor109.experience = 20;
doctor109.fees = 1200;

System.out.println("=============== One Hundred Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor109.doctorName);
System.out.println("Designation : " + doctor109.designation);
System.out.println("Specifications :");
for(String special : doctor109.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor109.experience + " Years");
System.out.println("Fees : " + doctor109.fees);


Doctor doctor110 = new Doctor();
doctor110.doctorName = "Dr. Vikas Maurya";
doctor110.designation = "Senior Director & HOD - Respiratory Medicine & Respiratory Critical Care | Fortis Shalimar Bagh";
String[] specifications110 = {
    "Pulmonology",
    "Interventional Pulmonology",
    "Sleep Medicine",
    "Pulmonology and Critical Care"
};
doctor110.specification = specifications110;
doctor110.experience = 25;
doctor110.fees = 1500;

System.out.println("=============== One Hundred Tenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor110.doctorName);
System.out.println("Designation : " + doctor110.designation);
System.out.println("Specifications :");
for(String special : doctor110.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor110.experience + " Years");
System.out.println("Fees : " + doctor110.fees);


Doctor doctor111 = new Doctor();
doctor111.doctorName = "Dr. Vikram Sharma";
doctor111.designation = "Senior Director Urology | FMRI Gurgaon";
String[] specifications111 = {
    "Urology",
    "Uro-Oncology"
};
doctor111.specification = specifications111;
doctor111.experience = 39;
doctor111.fees = 3000;

System.out.println("=============== One Hundred Eleventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor111.doctorName);
System.out.println("Designation : " + doctor111.designation);
System.out.println("Specifications :");
for(String special : doctor111.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor111.experience + " Years");
System.out.println("Fees : " + doctor111.fees);


Doctor doctor112 = new Doctor();
doctor112.doctorName = "Dr. Vimal Grover";
doctor112.designation = "Senior Director Obstetrics & Gynaecology | Fortis La Femme GK II";
String[] specifications112 = {
    "Obstetrics and Gynaecology"
};
doctor112.specification = specifications112;
doctor112.experience = 45;
doctor112.fees = 2000;

System.out.println("=============== One Hundred Twelfth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor112.doctorName);
System.out.println("Designation : " + doctor112.designation);
System.out.println("Specifications :");
for(String special : doctor112.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor112.experience + " Years");
System.out.println("Fees : " + doctor112.fees);


Doctor doctor113 = new Doctor();
doctor113.doctorName = "Dr. Vinay Samuel Gaikwad";
doctor113.designation = "Senior Director Surgical Oncology | Fortis Manesar";
String[] specifications113 = {
    "Oncology",
    "Surgical Oncology",
    "GI Oncology",
    "Robotic Surgery"
};
doctor113.specification = specifications113;
doctor113.experience = 24;
doctor113.fees = 1500;

System.out.println("=============== One Hundred Thirteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor113.doctorName);
System.out.println("Designation : " + doctor113.designation);
System.out.println("Specifications :");
for(String special : doctor113.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor113.experience + " Years");
System.out.println("Fees : " + doctor113.fees);


Doctor doctor114 = new Doctor();
doctor114.doctorName = "Dr. Vineeta Goel";
doctor114.designation = "Senior Director & HOD Radiation Oncology | Fortis Shalimar Bagh";
String[] specifications114 = {
    "Oncology",
    "Radiation Oncology"
};
doctor114.specification = specifications114;
doctor114.experience = 20;
doctor114.fees = 1200;

System.out.println("=============== One Hundred Fourteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor114.doctorName);
System.out.println("Designation : " + doctor114.designation);
System.out.println("Specifications :");
for(String special : doctor114.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor114.experience + " Years");
System.out.println("Fees : " + doctor114.fees);


Doctor doctor115 = new Doctor();
doctor115.doctorName = "Dr. Vineeta Taneja";
doctor115.designation = "Senior Director Internal Medicine | Fortis Shalimar Bagh";
String[] specifications115 = {
    "Internal Medicine",
    "Geriatric Medicine",
    "General Physician"
};
doctor115.specification = specifications115;
doctor115.experience = 25;
doctor115.fees = 1400;

System.out.println("=============== One Hundred Fifteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor115.doctorName);
System.out.println("Designation : " + doctor115.designation);
System.out.println("Specifications :");
for(String special : doctor115.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor115.experience + " Years");
System.out.println("Fees : " + doctor115.fees);

Doctor doctor116 = new Doctor();
doctor116.doctorName = "Dr. Vivek Jain";
doctor116.designation = "Senior Director & Unit Head Paediatrics | Fortis Shalimar Bagh";
String[] specifications116 = {
    "Paediatrics"
};
doctor116.specification = specifications116;
doctor116.experience = 18;
doctor116.fees = 1500;

System.out.println("=============== One Hundred Sixteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor116.doctorName);
System.out.println("Designation : " + doctor116.designation);
System.out.println("Specifications :");
for(String special : doctor116.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor116.experience + " Years");
System.out.println("Fees : " + doctor116.fees);


Doctor doctor117 = new Doctor();
doctor117.doctorName = "Dr. (Col.) Viney Jetley";
doctor117.designation = "Director Cardiology | Fortis Okhla";
String[] specifications117 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor117.specification = specifications117;
doctor117.experience = 28;
doctor117.fees = 2000;

System.out.println("=============== One Hundred Seventeenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor117.doctorName);
System.out.println("Designation : " + doctor117.designation);
System.out.println("Specifications :");
for(String special : doctor117.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor117.experience + " Years");
System.out.println("Fees : " + doctor117.fees);


Doctor doctor118 = new Doctor();
doctor118.doctorName = "Dr. A.S. Bawa";
doctor118.designation = "Director Urology | Fortis Mohali";
String[] specifications118 = {
    "Urology",
    "Uro-Oncology",
    "Paediatric Urology"
};
doctor118.specification = specifications118;
doctor118.experience = 32;
doctor118.fees = 1400;

System.out.println("=============== One Hundred Eighteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor118.doctorName);
System.out.println("Designation : " + doctor118.designation);
System.out.println("Specifications :");
for(String special : doctor118.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor118.experience + " Years");
System.out.println("Fees : " + doctor118.fees);


Doctor doctor119 = new Doctor();
doctor119.doctorName = "Dr. Abhay Inderjit Ahluwalia";
doctor119.designation = "Director Endocrinology | FMRI Gurgaon";
String[] specifications119 = {
    "Diabetology/Endocrinology",
    "Metabolic Surgery"
};
doctor119.specification = specifications119;
doctor119.experience = 34;
doctor119.fees = 2000;

System.out.println("=============== One Hundred Nineteenth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor119.doctorName);
System.out.println("Designation : " + doctor119.designation);
System.out.println("Specifications :");
for(String special : doctor119.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor119.experience + " Years");
System.out.println("Fees : " + doctor119.fees);

Doctor doctor120 = new Doctor();
doctor120.doctorName = "Dr. Amit Kumar Singhal";
doctor120.designation = "Director Cardiology | Fortis Jaipur";
String[] specifications120 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor120.specification = specifications120;
doctor120.experience = 13;
doctor120.fees = 900;

System.out.println("=============== One Hundred Twentieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor120.doctorName);
System.out.println("Designation : " + doctor120.designation);
System.out.println("Specifications :");
for(String special : doctor120.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor120.experience + " Years");
System.out.println("Fees : " + doctor120.fees);


Doctor doctor121 = new Doctor();
doctor121.doctorName = "Dr. Anand Sinha";
doctor121.designation = "Director Paediatrics | FMRI Gurgaon";
String[] specifications121 = {
    "Paediatrics",
    "Paediatric Surgery"
};
doctor121.specification = specifications121;
doctor121.experience = 17;
doctor121.fees = 1200;

System.out.println("=============== One Hundred Twenty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor121.doctorName);
System.out.println("Designation : " + doctor121.designation);
System.out.println("Specifications :");
for(String special : doctor121.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor121.experience + " Years");
System.out.println("Fees : " + doctor121.fees);


Doctor doctor122 = new Doctor();
doctor122.doctorName = "Dr. Anil Kumar Anand";
doctor122.designation = "Director & HOD Radiation Oncology | FCI Defence Colony";
String[] specifications122 = {
    "Oncology",
    "Radiation Oncology"
};
doctor122.specification = specifications122;
doctor122.experience = 31;
doctor122.fees = 2000;

System.out.println("=============== One Hundred Twenty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor122.doctorName);
System.out.println("Designation : " + doctor122.designation);
System.out.println("Specifications :");
for(String special : doctor122.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor122.experience + " Years");
System.out.println("Fees : " + doctor122.fees);


Doctor doctor123 = new Doctor();
doctor123.doctorName = "Dr. Anita Malik (Oncology)";
doctor123.designation = "Director Radiation Oncology | Fortis Noida";
String[] specifications123 = {
    "Oncology",
    "Radiation Oncology"
};
doctor123.specification = specifications123;
doctor123.experience = 15;
doctor123.fees = 1000;

System.out.println("=============== One Hundred Twenty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor123.doctorName);
System.out.println("Designation : " + doctor123.designation);
System.out.println("Specifications :");
for(String special : doctor123.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor123.experience + " Years");
System.out.println("Fees : " + doctor123.fees);

Doctor doctor124 = new Doctor();
doctor124.doctorName = "Dr. Anita Mathew";
doctor124.designation = "Director Internal Medicine | Fortis Mulund";
String[] specifications124 = {
    "Internal Medicine",
    "General Physician"
};
doctor124.specification = specifications124;
doctor124.experience = 17;
doctor124.fees = 1500;

System.out.println("=============== One Hundred Twenty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor124.doctorName);
System.out.println("Designation : " + doctor124.designation);
System.out.println("Specifications :");
for(String special : doctor124.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor124.experience + " Years");
System.out.println("Fees : " + doctor124.fees);


Doctor doctor125 = new Doctor();
doctor125.doctorName = "Dr. Anjana Singh";
doctor125.designation = "Director Obstetrics & Gynaecology | Fortis Noida";
String[] specifications125 = {
    "Obstetrics and Gynaecology"
};
doctor125.specification = specifications125;
doctor125.experience = 23;
doctor125.fees = 1200;

System.out.println("=============== One Hundred Twenty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor125.doctorName);
System.out.println("Designation : " + doctor125.designation);
System.out.println("Specifications :");
for(String special : doctor125.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor125.experience + " Years");
System.out.println("Fees : " + doctor125.fees);


Doctor doctor126 = new Doctor();
doctor126.doctorName = "Dr. Anuja Porwal";
doctor126.designation = "Director Nephrology | Fortis Noida";
String[] specifications126 = {
    "Nephrology"
};
doctor126.specification = specifications126;
doctor126.experience = 15;
doctor126.fees = 1400;

System.out.println("=============== One Hundred Twenty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor126.doctorName);
System.out.println("Designation : " + doctor126.designation);
System.out.println("Specifications :");
for(String special : doctor126.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor126.experience + " Years");
System.out.println("Fees : " + doctor126.fees);


Doctor doctor127 = new Doctor();
doctor127.doctorName = "Dr. Anup Gulati";
doctor127.designation = "Director Urology | Fortis Faridabad";
String[] specifications127 = {
    "Urology"
};
doctor127.specification = specifications127;
doctor127.experience = 20;
doctor127.fees = 900;

System.out.println("=============== One Hundred Twenty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor127.doctorName);
System.out.println("Designation : " + doctor127.designation);
System.out.println("Specifications :");
for(String special : doctor127.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor127.experience + " Years");
System.out.println("Fees : " + doctor127.fees);


Doctor doctor128 = new Doctor();
doctor128.doctorName = "Dr. Anupam Jindal";
doctor128.designation = "Director Neuro Surgery | Fortis Mohali";
String[] specifications128 = {
    "Neurosurgery"
};
doctor128.specification = specifications128;
doctor128.experience = 25;
doctor128.fees = 1050;

System.out.println("=============== One Hundred Twenty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor128.doctorName);
System.out.println("Designation : " + doctor128.designation);
System.out.println("Specifications :");
for(String special : doctor128.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor128.experience + " Years");
System.out.println("Fees : " + doctor128.fees);


Doctor doctor129 = new Doctor();
doctor129.doctorName = "Dr. Aparna Jaswal";
doctor129.designation = "Director Cardiology | Fortis Okhla";
String[] specifications129 = {
    "Cardiac Sciences",
    "Electrophysiology"
};
doctor129.specification = specifications129;
doctor129.experience = 19;
doctor129.fees = 2000;

System.out.println("=============== One Hundred Twenty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor129.doctorName);
System.out.println("Designation : " + doctor129.designation);
System.out.println("Specifications :");
for(String special : doctor129.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor129.experience + " Years");
System.out.println("Fees : " + doctor129.fees);


Doctor doctor130 = new Doctor();
doctor130.doctorName = "Dr. Archit Pandit";
doctor130.designation = "Director Surgical Oncology | Fortis Okhla";
String[] specifications130 = {
    "Oncology",
    "Head and Neck Oncosurgery",
    "Surgical Oncology",
    "Gynaecologic Oncology",
    "Robotic Surgery"
};
doctor130.specification = specifications130;
doctor130.experience = 15;
doctor130.fees = 1500;

System.out.println("=============== One Hundred Thirtieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor130.doctorName);
System.out.println("Designation : " + doctor130.designation);
System.out.println("Specifications :");
for(String special : doctor130.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor130.experience + " Years");
System.out.println("Fees : " + doctor130.fees);


Doctor doctor131 = new Doctor();
doctor131.doctorName = "Dr. Arpana Jain";
doctor131.designation = "Director Obstetrics & Gynaecology | Fortis Shalimar Bagh";
String[] specifications131 = {
    "Obstetrics and Gynaecology"
};
doctor131.specification = specifications131;
doctor131.experience = 27;
doctor131.fees = 1500;

System.out.println("=============== One Hundred Thirty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor131.doctorName);
System.out.println("Designation : " + doctor131.designation);
System.out.println("Specifications :");
for(String special : doctor131.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor131.experience + " Years");
System.out.println("Fees : " + doctor131.fees);

Doctor doctor132 = new Doctor();
doctor132.doctorName = "Dr. Arun Kumar";
doctor132.designation = "Director MICU | Fortis Mohali";
String[] specifications132 = {
    "Support Specialities",
    "Intensive Care and Critical Care",
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor132.specification = specifications132;
doctor132.experience = 20;
doctor132.fees = 1050;

System.out.println("=============== One Hundred Thirty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor132.doctorName);
System.out.println("Designation : " + doctor132.designation);
System.out.println("Specifications :");
for(String special : doctor132.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor132.experience + " Years");
System.out.println("Fees : " + doctor132.fees);


Doctor doctor133 = new Doctor();
doctor133.doctorName = "Dr. Arun Kumar Chopra";
doctor133.designation = "Director Cardiology | Fortis Amritsar";
String[] specifications133 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor133.specification = specifications133;
doctor133.experience = 22;
doctor133.fees = 1000;

System.out.println("=============== One Hundred Thirty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor133.doctorName);
System.out.println("Designation : " + doctor133.designation);
System.out.println("Specifications :");
for(String special : doctor133.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor133.experience + " Years");
System.out.println("Fees : " + doctor133.fees);


Doctor doctor134 = new Doctor();
doctor134.doctorName = "Dr. Arupratan Dutta / Dr. Arindam Kargupta Team";
doctor134.designation = "Director Nephrology | FHKI Kolkata";
String[] specifications134 = {
    "Nephrology"
};
doctor134.specification = specifications134;
doctor134.experience = 35;
doctor134.fees = 2000;

System.out.println("=============== One Hundred Thirty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor134.doctorName);
System.out.println("Designation : " + doctor134.designation);
System.out.println("Specifications :");
for(String special : doctor134.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor134.experience + " Years");
System.out.println("Fees : " + doctor134.fees);


Doctor doctor135 = new Doctor();
doctor135.doctorName = "Dr. Arvind Goyal";
doctor135.designation = "Director Urology | Fortis Ludhiana";
String[] specifications135 = {
    "Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor135.specification = specifications135;
doctor135.experience = 33;
doctor135.fees = 1000;

System.out.println("=============== One Hundred Thirty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor135.doctorName);
System.out.println("Designation : " + doctor135.designation);
System.out.println("Specifications :");
for(String special : doctor135.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor135.experience + " Years");
System.out.println("Fees : " + doctor135.fees);

Doctor doctor136 = new Doctor();
doctor136.doctorName = "Dr. Arvind Goyal";
doctor136.designation = "Director Urology | Fortis Mall Road";
String[] specifications136 = {
    "Urology",
    "Organ Transplant",
    "Kidney Transplant"
};
doctor136.specification = specifications136;
doctor136.experience = 33;
doctor136.fees = 1000;

System.out.println("=============== One Hundred Thirty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor136.doctorName);
System.out.println("Designation : " + doctor136.designation);
System.out.println("Specifications :");
for(String special : doctor136.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor136.experience + " Years");
System.out.println("Fees : " + doctor136.fees);


Doctor doctor137 = new Doctor();
doctor137.doctorName = "Dr. Arvind Kumar";
doctor137.designation = "Director Ophthalmology | Fortis Faridabad";
String[] specifications137 = {
    "Ophthalmology"
};
doctor137.specification = specifications137;
doctor137.experience = 19;
doctor137.fees = 700;

System.out.println("=============== One Hundred Thirty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor137.doctorName);
System.out.println("Designation : " + doctor137.designation);
System.out.println("Specifications :");
for(String special : doctor137.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor137.experience + " Years");
System.out.println("Fees : " + doctor137.fees);


Doctor doctor138 = new Doctor();
doctor138.doctorName = "Dr. Arvind Sahni";
doctor138.designation = "Director Gastroenterology | Fortis Mohali";
String[] specifications138 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology"
};
doctor138.specification = specifications138;
doctor138.experience = 31;
doctor138.fees = 1550;

System.out.println("=============== One Hundred Thirty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor138.doctorName);
System.out.println("Designation : " + doctor138.designation);
System.out.println("Specifications :");
for(String special : doctor138.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor138.experience + " Years");
System.out.println("Fees : " + doctor138.fees);


Doctor doctor139 = new Doctor();
doctor139.doctorName = "Dr. Arvind Sethi";
doctor139.designation = "Director Cardiology | Fortis Shalimar Bagh";
String[] specifications139 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor139.specification = specifications139;
doctor139.experience = 20;
doctor139.fees = 1800;

System.out.println("=============== One Hundred Thirty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor139.doctorName);
System.out.println("Designation : " + doctor139.designation);
System.out.println("Specifications :");
for(String special : doctor139.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor139.experience + " Years");
System.out.println("Fees : " + doctor139.fees);


Doctor doctor140 = new Doctor();
doctor140.doctorName = "Dr. Arvinder Singh Chilana";
doctor140.designation = "Director General Surgery | Fortis Shalimar Bagh";
String[] specifications140 = {
    "General Surgery",
    "General and Minimal Access Surgery",
    "General and Laparoscopic Surgery"
};
doctor140.specification = specifications140;
doctor140.experience = 35;
doctor140.fees = 1200;

System.out.println("=============== One Hundred Fortieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor140.doctorName);
System.out.println("Designation : " + doctor140.designation);
System.out.println("Specifications :");
for(String special : doctor140.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor140.experience + " Years");
System.out.println("Fees : " + doctor140.fees);


Doctor doctor141 = new Doctor();
doctor141.doctorName = "Dr. Ashis Pathak";
doctor141.designation = "Director Neuro Surgery | Fortis Mohali";
String[] specifications141 = {
    "Neurosurgery"
};
doctor141.specification = specifications141;
doctor141.experience = 41;
doctor141.fees = 1550;

System.out.println("=============== One Hundred Forty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor141.doctorName);
System.out.println("Designation : " + doctor141.designation);
System.out.println("Specifications :");
for(String special : doctor141.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor141.experience + " Years");
System.out.println("Fees : " + doctor141.fees);


Doctor doctor142 = new Doctor();
doctor142.doctorName = "Dr. Ashish Gupta";
doctor142.designation = "Director Neurosurgery | Fortis Mohali";
String[] specifications142 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor142.specification = specifications142;
doctor142.experience = 23;
doctor142.fees = 1550;

System.out.println("=============== One Hundred Forty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor142.doctorName);
System.out.println("Designation : " + doctor142.designation);
System.out.println("Specifications :");
for(String special : doctor142.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor142.experience + " Years");
System.out.println("Fees : " + doctor142.fees);


Doctor doctor143 = new Doctor();
doctor143.doctorName = "Dr. Ashok Omar";
doctor143.designation = "Director Non Invasive Cardiology | Fortis Okhla";
String[] specifications143 = {
    "Cardiac Sciences",
    "Non-Invasive Cardiology"
};
doctor143.specification = specifications143;
doctor143.experience = 33;
doctor143.fees = 2000;

System.out.println("=============== One Hundred Forty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor143.doctorName);
System.out.println("Designation : " + doctor143.designation);
System.out.println("Specifications :");
for(String special : doctor143.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor143.experience + " Years");
System.out.println("Fees : " + doctor143.fees);

Doctor doctor144 = new Doctor();
doctor144.doctorName = "Dr. Ashutosh Marwah";
doctor144.designation = "Director Paediatric Cardiology | Fortis Okhla";
String[] specifications144 = {
    "Paediatrics",
    "Paediatric Cardiac Sciences"
};
doctor144.specification = specifications144;
doctor144.experience = 28;
doctor144.fees = 1500;

System.out.println("=============== One Hundred Forty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor144.doctorName);
System.out.println("Designation : " + doctor144.designation);
System.out.println("Specifications :");
for(String special : doctor144.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor144.experience + " Years");
System.out.println("Fees : " + doctor144.fees);


Doctor doctor145 = new Doctor();
doctor145.doctorName = "Dr. Ashutosh Shrivastav";
doctor145.designation = "Director Orthopaedics | Fortis Faridabad";
String[] specifications145 = {
    "Orthopaedics",
    "Orthopaedics and Joint Replacement",
    "Sports Medicine"
};
doctor145.specification = specifications145;
doctor145.experience = 23;
doctor145.fees = 700;

System.out.println("=============== One Hundred Forty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor145.doctorName);
System.out.println("Designation : " + doctor145.designation);
System.out.println("Specifications :");
for(String special : doctor145.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor145.experience + " Years");
System.out.println("Fees : " + doctor145.fees);


Doctor doctor146 = new Doctor();
doctor146.doctorName = "Dr. Atul Limaye";
doctor146.designation = "Director Cardiology & TAVI Services | Fortis Mulund";
String[] specifications146 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor146.specification = specifications146;
doctor146.experience = 22;
doctor146.fees = 2500;

System.out.println("=============== One Hundred Forty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor146.doctorName);
System.out.println("Designation : " + doctor146.designation);
System.out.println("Specifications :");
for(String special : doctor146.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor146.experience + " Years");
System.out.println("Fees : " + doctor146.fees);


Doctor doctor147 = new Doctor();
doctor147.doctorName = "Dr. Atul Morarji Ganatra";
doctor147.designation = "Director Obstetrics & Gynaecology | Fortis Mulund";
String[] specifications147 = {
    "Obstetrics and Gynaecology"
};
doctor147.specification = specifications147;
doctor147.experience = 33;
doctor147.fees = 2000;

System.out.println("=============== One Hundred Forty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor147.doctorName);
System.out.println("Designation : " + doctor147.designation);
System.out.println("Specifications :");
for(String special : doctor147.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor147.experience + " Years");
System.out.println("Fees : " + doctor147.fees);

Doctor doctor148 = new Doctor();
doctor148.doctorName = "Dr. Avanish Saklani";
doctor148.designation = "Director Surgical Oncology | Fortis Mulund";
String[] specifications148 = {
    "Oncology",
    "Surgical Oncology",
    "Robotic Surgery"
};
doctor148.specification = specifications148;
doctor148.experience = 25;
doctor148.fees = 2000;

System.out.println("=============== One Hundred Forty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor148.doctorName);
System.out.println("Designation : " + doctor148.designation);
System.out.println("Specifications :");
for(String special : doctor148.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor148.experience + " Years");
System.out.println("Fees : " + doctor148.fees);


Doctor doctor149 = new Doctor();
doctor149.doctorName = "Dr. Ayesha Zafar Siddiqui";
doctor149.designation = "Director Radiology | Fortis Noida";
String[] specifications149 = {
    "Radiology"
};
doctor149.specification = specifications149;
doctor149.experience = 20;
doctor149.fees = 1000;

System.out.println("=============== One Hundred Forty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor149.doctorName);
System.out.println("Designation : " + doctor149.designation);
System.out.println("Specifications :");
for(String special : doctor149.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor149.experience + " Years");
System.out.println("Fees : " + doctor149.fees);


Doctor doctor150 = new Doctor();
doctor150.doctorName = "Dr. BN Singh";
doctor150.designation = "Director Internal Medicine | Fortis Faridabad";
String[] specifications150 = {
    "Internal Medicine",
    "General Physician"
};
doctor150.specification = specifications150;
doctor150.experience = 35;
doctor150.fees = 800;

System.out.println("=============== One Hundred Fiftieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor150.doctorName);
System.out.println("Designation : " + doctor150.designation);
System.out.println("Specifications :");
for(String special : doctor150.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor150.experience + " Years");
System.out.println("Fees : " + doctor150.fees);


Doctor doctor151 = new Doctor();
doctor151.doctorName = "Dr. Bandana Sodhi";
doctor151.designation = "Director Obstetrics & Gynaecology | Fortis LaFemme GK II";
String[] specifications151 = {
    "Obstetrics and Gynaecology"
};
doctor151.specification = specifications151;
doctor151.experience = 35;
doctor151.fees = 1500;

System.out.println("=============== One Hundred Fifty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor151.doctorName);
System.out.println("Designation : " + doctor151.designation);
System.out.println("Specifications :");
for(String special : doctor151.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor151.experience + " Years");
System.out.println("Fees : " + doctor151.fees);


Doctor doctor152 = new Doctor();
doctor152.doctorName = "Dr. Basabbijay Sarkar";
doctor152.designation = "Director Internal Medicine | Fortis Anandapur";
String[] specifications152 = {
    "Internal Medicine"
};
doctor152.specification = specifications152;
doctor152.experience = 23;
doctor152.fees = 1600;

System.out.println("=============== One Hundred Fifty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor152.doctorName);
System.out.println("Designation : " + doctor152.designation);
System.out.println("Specifications :");
for(String special : doctor152.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor152.experience + " Years");
System.out.println("Fees : " + doctor152.fees);


Doctor doctor153 = new Doctor();
doctor153.doctorName = "Dr. Bimlesh Dhar Pandey";
doctor153.designation = "Director Rheumatology | Fortis Noida";
String[] specifications153 = {
    "Rheumatology"
};
doctor153.specification = specifications153;
doctor153.experience = 17;
doctor153.fees = 1500;

System.out.println("=============== One Hundred Fifty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor153.doctorName);
System.out.println("Designation : " + doctor153.designation);
System.out.println("Specifications :");
for(String special : doctor153.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor153.experience + " Years");
System.out.println("Fees : " + doctor153.fees);


Doctor doctor154 = new Doctor();
doctor154.doctorName = "Dr. Boman Nariman Dhabhar";
doctor154.designation = "Director Oncology | Fortis Mulund";
String[] specifications154 = {
    "Oncology",
    "Medical Oncology"
};
doctor154.specification = specifications154;
doctor154.experience = 22;
doctor154.fees = 2000;

System.out.println("=============== One Hundred Fifty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor154.doctorName);
System.out.println("Designation : " + doctor154.designation);
System.out.println("Specifications :");
for(String special : doctor154.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor154.experience + " Years");
System.out.println("Fees : " + doctor154.fees);


Doctor doctor155 = new Doctor();
doctor155.doctorName = "Dr. Charudatt Vaity";
doctor155.designation = "Director Critical Care | Fortis Mulund";
String[] specifications155 = {
    "Critical Care"
};
doctor155.specification = specifications155;
doctor155.experience = 20;
doctor155.fees = 1500;

System.out.println("=============== One Hundred Fifty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor155.doctorName);
System.out.println("Designation : " + doctor155.designation);
System.out.println("Specifications :");
for(String special : doctor155.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor155.experience + " Years");
System.out.println("Fees : " + doctor155.fees);

Doctor doctor156 = new Doctor();
doctor156.doctorName = "Dr. Davinder Mohan";
doctor156.designation = "Director Cardio Thoracic Vascular Surgery | Fortis Amritsar";
String[] specifications156 = {
    "Cardiac Sciences",
    "Adult CTVS (Cardiothoracic and Vascular Surgery)"
};
doctor156.specification = specifications156;
doctor156.experience = 24;
doctor156.fees = 700;

System.out.println("=============== One Hundred Fifty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor156.doctorName);
System.out.println("Designation : " + doctor156.designation);
System.out.println("Specifications :");
for(String special : doctor156.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor156.experience + " Years");
System.out.println("Fees : " + doctor156.fees);


Doctor doctor157 = new Doctor();
doctor157.doctorName = "Dr. Deepak Joshi";
doctor157.designation = "Director Orthopaedics | Fortis Mohali";
String[] specifications157 = {
    "Orthopaedics",
    "Orthopaedics and Spine Surgery"
};
doctor157.specification = specifications157;
doctor157.experience = 20;
doctor157.fees = 1050;

System.out.println("=============== One Hundred Fifty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor157.doctorName);
System.out.println("Designation : " + doctor157.designation);
System.out.println("Specifications :");
for(String special : doctor157.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor157.experience + " Years");
System.out.println("Fees : " + doctor157.fees);


Doctor doctor158 = new Doctor();
doctor158.doctorName = "Dr. Deepak Kapila";
doctor158.designation = "Director Cardiology | Fortis Amritsar";
String[] specifications158 = {
    "Cardiac Sciences",
    "Interventional Cardiology"
};
doctor158.specification = specifications158;
doctor158.experience = 22;
doctor158.fees = 800;

System.out.println("=============== One Hundred Fifty Eighth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor158.doctorName);
System.out.println("Designation : " + doctor158.designation);
System.out.println("Specifications :");
for(String special : doctor158.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor158.experience + " Years");
System.out.println("Fees : " + doctor158.fees);


Doctor doctor159 = new Doctor();
doctor159.doctorName = "Dr. Deepak Kumar Jain (IOSPL)";
doctor159.designation = "Director Surgical Oncology | Fortis Noida";
String[] specifications159 = {
    "Oncology",
    "Surgical Oncology"
};
doctor159.specification = specifications159;
doctor159.experience = 15;
doctor159.fees = 1000;

System.out.println("=============== One Hundred Fifty Ninth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor159.doctorName);
System.out.println("Designation : " + doctor159.designation);
System.out.println("Specifications :");
for(String special : doctor159.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor159.experience + " Years");
System.out.println("Fees : " + doctor159.fees);

Doctor doctor160 = new Doctor();
doctor160.doctorName = "Dr. Deepak Kumar Bhasin";
doctor160.designation = "Director Gastroenterology | Fortis Mohali";
String[] specifications160 = {
    "Gastroenterology and Hepatobiliary Sciences",
    "Gastroenterology"
};
doctor160.specification = specifications160;
doctor160.experience = 47;
doctor160.fees = 1550;

System.out.println("=============== One Hundred Sixtieth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor160.doctorName);
System.out.println("Designation : " + doctor160.designation);
System.out.println("Specifications :");
for(String special : doctor160.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor160.experience + " Years");
System.out.println("Fees : " + doctor160.fees);


Doctor doctor161 = new Doctor();
doctor161.doctorName = "Dr. Deepali Marwaha";
doctor161.designation = "Director Radiology | Fortis Jalandhar";
String[] specifications161 = {
    "Radiology"
};
doctor161.specification = specifications161;
doctor161.experience = 26;
doctor161.fees = 600;

System.out.println("=============== One Hundred Sixty First Doctor Information ===============");
System.out.println("Doctor Name : " + doctor161.doctorName);
System.out.println("Designation : " + doctor161.designation);
System.out.println("Specifications :");
for(String special : doctor161.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor161.experience + " Years");
System.out.println("Fees : " + doctor161.fees);


Doctor doctor162 = new Doctor();
doctor162.doctorName = "Dr. Deshpande Vasudevarao Rajakumar";
doctor162.designation = "Director Neuro Surgery | Fortis BG Road";
String[] specifications162 = {
    "Neurosurgery",
    "Neuro and Spine Surgery"
};
doctor162.specification = specifications162;
doctor162.experience = 31;
doctor162.fees = 1200;

System.out.println("=============== One Hundred Sixty Second Doctor Information ===============");
System.out.println("Doctor Name : " + doctor162.doctorName);
System.out.println("Designation : " + doctor162.designation);
System.out.println("Specifications :");
for(String special : doctor162.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor162.experience + " Years");
System.out.println("Fees : " + doctor162.fees);


Doctor doctor163 = new Doctor();
doctor163.doctorName = "Dr. Dibyendu Mukherjee";
doctor163.designation = "Director Internal Medicine | Fortis Anandapur";
String[] specifications163 = {
    "Internal Medicine"
};
doctor163.specification = specifications163;
doctor163.experience = 25;
doctor163.fees = 1500;

System.out.println("=============== One Hundred Sixty Third Doctor Information ===============");
System.out.println("Doctor Name : " + doctor163.doctorName);
System.out.println("Designation : " + doctor163.designation);
System.out.println("Specifications :");
for(String special : doctor163.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor163.experience + " Years");
System.out.println("Fees : " + doctor163.fees);


Doctor doctor164 = new Doctor();
doctor164.doctorName = "Dr. Digambar Behera";
doctor164.designation = "Director Pulmonology | Fortis Mohali";
String[] specifications164 = {
    "Pulmonology"
};
doctor164.specification = specifications164;
doctor164.experience = 41;
doctor164.fees = 1500;

System.out.println("=============== One Hundred Sixty Fourth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor164.doctorName);
System.out.println("Designation : " + doctor164.designation);
System.out.println("Specifications :");
for(String special : doctor164.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor164.experience + " Years");
System.out.println("Fees : " + doctor164.fees);


Doctor doctor165 = new Doctor();
doctor165.doctorName = "Dr. Dinesh Kapoor";
doctor165.designation = "Director Radiology | Fortis Noida";
String[] specifications165 = {
    "Radiology"
};
doctor165.specification = specifications165;
doctor165.experience = 30;
doctor165.fees = 1000;

System.out.println("=============== One Hundred Sixty Fifth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor165.doctorName);
System.out.println("Designation : " + doctor165.designation);
System.out.println("Specifications :");
for(String special : doctor165.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor165.experience + " Years");
System.out.println("Fees : " + doctor165.fees);


Doctor doctor166 = new Doctor();
doctor166.doctorName = "Dr. Dinesh Kumar";
doctor166.designation = "Director Internal Medicine | Fortis Greater Noida";
String[] specifications166 = {
    "Internal Medicine",
    "General Physician"
};
doctor166.specification = specifications166;
doctor166.experience = 31;
doctor166.fees = 900;

System.out.println("=============== One Hundred Sixty Sixth Doctor Information ===============");
System.out.println("Doctor Name : " + doctor166.doctorName);
System.out.println("Designation : " + doctor166.designation);
System.out.println("Specifications :");
for(String special : doctor166.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor166.experience + " Years");
System.out.println("Fees : " + doctor166.fees);


Doctor doctor167 = new Doctor();
doctor167.doctorName = "Dr. Farah Atul Ingale";
doctor167.designation = "Director Internal Medicine | Fortis Vashi";
String[] specifications167 = {
    "Internal Medicine"
};
doctor167.specification = specifications167;
doctor167.experience = 36;
doctor167.fees = 1800;

System.out.println("=============== One Hundred Sixty Seventh Doctor Information ===============");
System.out.println("Doctor Name : " + doctor167.doctorName);
System.out.println("Designation : " + doctor167.designation);
System.out.println("Specifications :");
for(String special : doctor167.specification){
    System.out.println(special);
}
System.out.println("Experience : " + doctor167.experience + " Years");
System.out.println("Fees : " + doctor167.fees);









}
}