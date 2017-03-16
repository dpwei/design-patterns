package com.lewiswei.builder;

public final class Hero {

    private final Profession profession;
    private final String name;
    private final Weapon weapon;
    private final HairType hairType;
    private final HairColor hairColor;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.heroName;
        this.weapon = builder.weapon;
        this.hairType = builder.hairType;
        this.hairColor = builder.hairColor;
    }

    public Profession getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public HairType getHairType() {
        return hairType;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public static class Builder {
        private final Profession profession;
        private final String heroName;
        private Weapon weapon;
        private HairType hairType;
        private HairColor hairColor;

        /**
         * 必填的属性值
         *
         * @param profession
         * @param heroName
         */
        public Builder(Profession profession, String heroName) {
            if (profession == null || "".equals(heroName)) {
                throw new IllegalArgumentException();
            }
            this.profession = profession;
            this.heroName = heroName;
        }

        public Hero build() {
            return new Hero(this);
        }

        public Builder withWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Builder withHairType(HairType hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withHairColor(HairColor hairColor) {
            this.hairColor = hairColor;
            return this;
        }
    }
}
