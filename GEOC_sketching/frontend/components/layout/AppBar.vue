<template>
  <v-app-bar
    fixed
    app
  >
    <v-row justify="center">
      <v-col xl="8" lg="9" md="10">
        <v-row justify="center">
          <v-col class="mt-2" cols="3">
            <v-row justify="start">
              <v-icon x-large color="primary">
                mdi-alpha-g-circle
              </v-icon>
              <span class="mt-1 headline">
                EOC
              </span>
            </v-row>
          </v-col>
          <v-col class="mt-2" cols="6">
            <TheIconWithTooltip
              v-for="(menu, idx) in menus"
              :key="idx"
              class="mx-3"
              :icon-name="menu.icon"
              :icon-color="menu.color"
              :title="menu.title"
              icon-x-large
              @click="search"
            />
          </v-col>
          <v-col cols="3">
            <v-card
              class="mx-auto mhx-60"
              color="header"
              shaped
              elevation="0"
            >
              <v-list-item dense no-gutters>
                <v-list-item-content class="header-data-user text-right">
                  <span class="text-right">
                    {{ userData.apeynom }}
                  </span>
                  <v-list-item-subtitle>
                    <v-row no-gutters>
                      <v-col class="text-right">
                        <div class="text-right">
                          {{ userData.charge }}
                        </div>
                        <div>
                          {{ userData.company }}
                        </div>
                      </v-col>
                    </v-row>
                  </v-list-item-subtitle>
                </v-list-item-content>
                <v-list-item-icon>
                  <v-icon class="mt-4" x-large>
                    mdi-account-circle
                  </v-icon>
                </v-list-item-icon>
              </v-list-item>
            </v-card>
          </v-col>
        </v-row>
      </v-col>
    </v-row>
  </v-app-bar>
</template>

<script>
import TheIconWithTooltip from '~/components/General/Buttons/TheButtonWithTooltip'
export default {
  components: {
    TheIconWithTooltip
  },
  data () {
    return {
      userData: {
        username: 'Usuario',
        apeynom: 'Usuario 1',
        charge: 'Responable de compras',
        company: 'Empresa de prueba'
      },
      contactEmail: 'support@mail.com',
      contactPhone: '12 3456 7890',
      menus: [
        {
          title: 'Categorías',
          path: '/',
          icon: 'mdi-format-list-bulleted',
          color: 'blue darken-4'
        },
        {
          title: 'Mis proveedores',
          path: '/',
          icon: 'mdi-account-supervisor-circle',
          color: 'blue darken-4'
        },
        {
          title: 'Mis productos',
          path: '/',
          icon: 'mdi-alpha-p-circle',
          color: 'blue darken-4'
        },
        {
          title: 'Mis órdenes de compra',
          path: '/',
          icon: 'mdi-file-document',
          color: 'blue darken-4'
        }
      ]
    }
  },
  methods: {
    search () {
      this.toastNotification('Acá habría lógica')
    }
  }
}
</script>
