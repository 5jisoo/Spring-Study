package hello.hellosping.domain;

public class Member {
    private Long id;    //데이터 구분을 위한 시스템이 지정하는 아이디
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}