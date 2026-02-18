package lesson5_ISP.problematicCode;

public interface User {

    boolean canBuyProduct();

    boolean canModifyProduct();

    boolean canAddProduct();

    boolean canApproveProduct();

    boolean approvedProduct();
}
