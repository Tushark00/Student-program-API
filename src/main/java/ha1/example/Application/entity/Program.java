package ha1.example.Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "program")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer programId;

    private String name;
    private Double price;
    private String domain;
    private String type;
    private Boolean registration; //open:true /close:false
    private String description;
    private Boolean placementAssurance; //yes:true /no:false
    private String imgUrl;
    private String universityName;
    private String facultyProfile;
    private Integer learningHours;
    private Integer duration;
    private String certificate;
    private String criteria;

    public Program() {
    }

    public Program(Integer programId, String name, Double price, String domain, String type,  Boolean registration, String description,  Boolean placementAssurance, String imgUrl, String universityName, String facultyProfile, Integer learningHours, Integer duration, String certificate, String criteria) {
        this.programId = programId;
        this.name = name;
        this.price = price;
        this.domain = domain;
        this.type = type;
        this.registration = registration;
        this.description = description;
        this.placementAssurance = placementAssurance;
        this.imgUrl = imgUrl;
        this.universityName = universityName;
        this.facultyProfile = facultyProfile;
        this.learningHours = learningHours;
        this.duration = duration;
        this.certificate = certificate;
        this.criteria = criteria;
    }

    @Override
    public String toString() {
        return "Program{" +
                "programId=" + programId +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", domain='" + domain + '\'' +
                ", type='" + type + '\'' +
                ", registration='" + registration + '\'' +
                ", description='" + description + '\'' +
                ", placementAssurance='" + placementAssurance + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", universityName='" + universityName + '\'' +
                ", facultyProfile='" + facultyProfile + '\'' +
                ", learningHours=" + learningHours +
                ", duration=" + duration +
                ", certificate='" + certificate + '\'' +
                ", criteria='" + criteria + '\'' +
                '}';
    }

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRegistration() {
        return registration;
    }

    public void setRegistration( Boolean registration) {
        this.registration = registration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getplacementAssurance() {
        return placementAssurance;
    }

    public void setplacementAssurance( Boolean placementAssurance) {
        this.placementAssurance = placementAssurance;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFacultyProfile() {
        return facultyProfile;
    }

    public void setFacultyProfile(String facultyProfile) {
        this.facultyProfile = facultyProfile;
    }

    public Integer getLearningHours() {
        return learningHours;
    }

    public void setLearningHours(Integer learningHours) {
        this.learningHours = learningHours;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }
}
