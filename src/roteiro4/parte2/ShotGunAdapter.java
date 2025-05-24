package roteiro4.parte2;

import armas.artilharia.ShotGun;

// shotgun é a nova arma do outro fornecedor

// shotgun adapter adapta um projeto de software para outro

public class ShotGunAdapter extends ShotGun implements Arma {
    @Override
    public void carregar() {
        this.loadGun();
    }

    @Override
    public void atirar() {
        this.shotKill();
    }

    @Override
    public void mirar() {
        this.targetEnemy();
    }
}
