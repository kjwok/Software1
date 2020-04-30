package frontend.staff;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frontend.GenericEnum;

public class StaffPatientRecordParameters extends GenericStaffScreen {
   StaffPatientRecordParameters(StaffRunner r) {
      super(r);
      // TODO Auto-generated constructor stub
   }

   private void parameters(Container pane) {
      // creating panel to store all of the parameters
      JPanel main = new JPanel();
      
      JPanel titlePanel = new JPanel();
      titlePanel.setLayout(new GridLayout(1, 3));
      titlePanel.setBorder(BorderFactory.createTitledBorder(""));
      titlePanel.setBackground(Color.GRAY);
      JPanel fillerPanel1 = new JPanel();
      fillerPanel1.setBackground(Color.GRAY);
      titlePanel.add(fillerPanel1);
      JLabel title = new JLabel("Select Parameters for Patient Records");
      title.setFont(title.getFont().deriveFont(15f));
      titlePanel.add(new JLabel(""));
      titlePanel.add(title);
      JPanel fillerPanel2 = new JPanel();
      fillerPanel2.setBackground(Color.GRAY);
      titlePanel.add(fillerPanel2);
      titlePanel.add(new JLabel(""));

      // creating parameter #1
      JPanel maritalStatus = new JPanel();
      maritalStatus.setBorder(BorderFactory.createTitledBorder("Marital Status"));
      JComboBox<String> status = new JComboBox<String>();
      status.addItem("n/a");
      status.addItem("Single");
      status.addItem("Married");
      status.addItem("Divorce");
      status.addItem("Widowed");
      maritalStatus.add(status);

      // creating parameter #2
      JPanel ageRange = new JPanel();
      ageRange.setBorder(BorderFactory.createTitledBorder("Age Range"));
      JComboBox<String> age = new JComboBox<String>();
      age.addItem("n/a");
      age.addItem("0–5");
      age.addItem("6–12");
      age.addItem("13–19");
      age.addItem("20–35");
      age.addItem("36-50");
      age.addItem("50-65");
      age.addItem("66-80");
      age.addItem("80");
      ageRange.add(age);

      // creating parameter #3
      JPanel diagnosis = new JPanel();
      diagnosis.setBorder(BorderFactory.createTitledBorder("Diagnosis"));
      JComboBox<String> allDiagnosis = new JComboBox<String>();
      allDiagnosis.addItem("n/a");
      /**
       * TODO NEED TO ADD THE DIAGNOSIS FROM THE DATABASE
       */
      allDiagnosis.addItem("DUMMY");
      allDiagnosis.addItem("DUMMY");
      diagnosis.add(allDiagnosis);

      // creating parameter #4
      JPanel doctor = new JPanel();
      doctor.setBorder(BorderFactory.createTitledBorder("Doctor"));
      JComboBox<String> allDoctors = new JComboBox<String>();
      allDoctors.addItem("n/a");
      /**
       * TODO NEED TO ADD THE DOCTORS FROM THE DATABASE
       */
      allDoctors.addItem("DUMMY");
      allDoctors.addItem("DUMMY");
      doctor.add(allDoctors);

      // creating parameter #5
      JPanel prescrip = new JPanel();
      prescrip.setBorder(BorderFactory.createTitledBorder("Prescriptions"));
      JComboBox<String> allPrescrips = new JComboBox<String>();
      allPrescrips.addItem("n/a");
      /**
       * TODO NEED TO ADD THE DOCTORS FROM THE DATABASE
       */
      allPrescrips.addItem("DUMMY");
      allPrescrips.addItem("DUMMY");
      prescrip.add(allPrescrips);
      
      main.add(titlePanel);
      main.add(maritalStatus);
      main.add(ageRange);
      main.add(diagnosis);
      main.add(doctor);
      main.add(prescrip);
      
      JButton submit = new JButton("Sumbit");
      submit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            r.displayFrameOpt(GenericEnum.VIEWRECORDS);
         }
      });

      main.add(submit);
      
      // adding the main panel to the container sent in
      pane.add(main);
   }

   public void createAndShowGUI(Container pane) {
      topBarStaff(pane);
      parameters(pane);
      staffSideBar(pane);
   }

}
