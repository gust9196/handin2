class RapSong {
    void play() {
        System.out.println("Playing a rap song");
    }
}

class OldSchoolRap extends RapSong {
    @Override
    void play() {
        System.out.println("Playing old school rap");
    }
}

class NewSchoolRap extends RapSong {
    @Override
    void play() {
        System.out.println("Playing new school rap");
    }
}