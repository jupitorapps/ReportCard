package com.example.lenovo.first.reportcard;


import android.util.Log;

public class ReportCard {
    private String schoolName = "N J High School";
    private String className = "10th";
    private int fullMark = 500;
    private String mStudentName;
    private int mRollNo;
    private int mEnglishMarks;
    private int mMathMarks;
    private int mScienceMarks;
    private int mEconomicsMarks;
    private int mLogicMarks;


    public ReportCard(String studentName, int rollNo,
                      int englishMarks, int mathMarks, int scienceMarks, int economicsMarks,
                      int logicMarks) {
        mStudentName = studentName;
        mRollNo = rollNo;
        mEnglishMarks = englishMarks;
        mMathMarks = mathMarks;
        mScienceMarks = scienceMarks;
        mEconomicsMarks = economicsMarks;
        mLogicMarks = logicMarks;

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getFullMark() {
        return fullMark;
    }

    public void setFullMark(int fullMark) {
        this.fullMark = fullMark;
    }

    public String getmStudentName() {
        return mStudentName;
    }

    public void setmStudentName(String mStudentName) {
        this.mStudentName = mStudentName;
    }

    public int getmRollNo() {
        return mRollNo;
    }

    public void setmRollNo(int mRollNo) {
        this.mRollNo = mRollNo;
    }

    public int getmEnglishMarks() {
        return mEnglishMarks;
    }

    public void setmEnglishMarks(int mEnglishMarks) {
        this.mEnglishMarks = mEnglishMarks;
    }

    public int getmMathMarks() {
        return mMathMarks;
    }

    public void setmMathMarks(int mMathMarks) {
        this.mMathMarks = mMathMarks;
    }

    public int getmScienceMarks() {
        return mScienceMarks;
    }

    public void setmScienceMarks(int mScienceMarks) {
        this.mScienceMarks = mScienceMarks;
    }

    public int getmEconomicsMarks() {
        return mEconomicsMarks;
    }

    public void setmEconomicsMarks(int mEconomicsMarks) {
        this.mEconomicsMarks = mEconomicsMarks;
    }

    public int getmLogicMarks() {
        return mLogicMarks;
    }

    public void setmLogicMarks(int mLogicMarks) {
        this.mLogicMarks = mLogicMarks;
    }

    private int getTotalMarks() {
        int totalMark;
        totalMark = getmEnglishMarks() + getmMathMarks() + getmScienceMarks() + getmEconomicsMarks() + getmLogicMarks();
        return totalMark;
    }

    private double getPercentageMarks() {
        double percentage = (getTotalMarks() / getFullMark()) * 100;
        Log.i("MyLog: ", "Full Mark: " + getFullMark());
        Log.i("MyLog: ", "Total Mark: " + getTotalMarks());
        Log.i("MyLog: ", "Percentage: " + percentage);
        return percentage;

        //Percentage is not workign correctly ..

    }

    private String getGrade() {
        String grade = null;

        if (getTotalMarks() > 400) {
            grade = "A";
        } else if (getTotalMarks() < 400 && getTotalMarks() >= 300) {
            grade = "B";
        } else if (getTotalMarks() < 300) {
            grade = "C";
        }

        return grade;
    }


    public String showResult() {

        return "School: " + getSchoolName() + '\n' +
                "Class: " + getClassName() + '\n' +
                "Student Name: " + getmStudentName() + '\n' +
                "Roll No.: " + getmRollNo() + '\n' +
                "English Marks: " + getmEnglishMarks() + '\n' +
                "Math Marks: " + getmMathMarks() + '\n' +
                "Science Marks: " + getmScienceMarks() + '\n' +
                "Economics Marks: " + getmEconomicsMarks() + '\n' +
                "Logic Marks: " + getmLogicMarks() + '\n' +
                "Total Marks: " + getTotalMarks() + '\n' +
                "Percentage Obtained: " + getPercentageMarks() + " %" + '\n' +
                "Grade : " + getGrade();

    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "studentName='" + mStudentName + '\'' +
                ", rollNumber=" + mRollNo +
                ", englishMarks=" + mEnglishMarks +
                ", mathMarks=" + mMathMarks +
                ", physicsMarks=" + mScienceMarks +
                ", chemistryMarks=" + mEconomicsMarks +
                ", socialMarks=" + mLogicMarks +
                ", grade='" + getGrade() + '\'' +
                '}';
    }


}
