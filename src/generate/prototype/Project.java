package generate.prototype;

public class Project implements CopyMaster{
    private int test;

    public Project(int test) {
        this.test = test;
    }

    @Override
    public Object copy() {
        Project copyProj = new Project(test);

        return copyProj;
    }

    @Override
    public String toString() {
        return "Project{" +
                "test=" + test +
                '}';
    }

}
