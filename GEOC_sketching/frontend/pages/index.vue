<template>
  <TheLayoutWithHeader title="Mis proveedores" icon-title="mdi-account-supervisor-circle">
    <template #filter>
      <v-row>
        <v-col cols="2">
          <v-text-field
            v-model="filter.code"
            label="Filtrar por código"
            clearable
          />
        </v-col>
        <v-col cols="2">
          <v-text-field
            v-model="filter.name"
            label="Filtrar por nombre"
            clearable
          />
        </v-col>
        <v-col cols="5">
          <v-autocomplete
            v-model="filter.products"
            :items="products"
            label="Filtrar por productos"
            clearable
            multiple
          />
        </v-col>
        <v-col cols="2">
          <v-btn
            class="mt-3"
            color="primary"
            @click="search"
          >
            Buscar
          </v-btn>
        </v-col>
      </v-row>
    </template>
    <template #body>
      <TheFilterTable
        :items="providers"
        :headers="headers"
      >
        <template #[`item.products`]="{ item }">
          {{ item.products.map(product => product.name).join(', ') }}
        </template>
        <template #[`item.actions`]="{ }">
          <TheIconWithTooltip
            icon-name="mdi-magnify"
            icon-color="primary"
            title="Mas información"
            @click="search"
          />
          <TheIconWithTooltip
            icon-name="mdi-trash-can"
            icon-color="orange"
            title="Eliminar"
            @click="search"
          />
        </template>
      </TheFilterTable>
    </template>
  </TheLayoutWithHeader>
</template>
<script>
import { cloneDeep } from 'lodash'
import TheLayoutWithHeader from '~/components/General/Layouts/TheLayoutWithHeader'
import TheFilterTable from '~/components/General/Tables/TheFilterTable'
import TheIconWithTooltip from '~/components/General/Buttons/TheButtonWithTooltip'
export default {
  components: {
    TheIconWithTooltip,
    TheLayoutWithHeader,
    TheFilterTable
  },
  data: () => ({
    filter: {
      products: []
    },
    products: ['Lorem', 'Ipsum', 'asud'
    ],
    headers: [
      {
        text: 'Código',
        sortable: true,
        value: 'code'
      },
      {
        text: 'Nombre',
        sortable: true,
        value: 'name'
      },
      {
        text: 'Producto/s',
        value: 'products',
        sortable: true
      },
      {
        text: 'Acciones',
        value: 'actions',
        sortable: false
      }
    ]
  }),
  computed: {
    providers () {
      const element = {
        code: '011323161351',
        name: 'Lorem Ipsum',
        products: [
          {
            name: 'Lorem'
          },
          {
            name: 'Ipsum'
          },
          {
            name: 'asud'
          },
          {
            name: 'oainsd'
          }
        ]
      }
      const element2 = {
        code: '6511',
        name: 'John Doe',
        products: [
          {
            name: 'Lorem'
          }
        ]
      }
      const element3 = {
        code: '545462',
        name: 'Peter Doe',
        products: [
          {
            name: 'Ipsum'
          }
        ]
      }
      const providerMockList = []
      let x
      for (x = 0; x < 50; x++) {
        providerMockList.push(cloneDeep(element))
        providerMockList.push(cloneDeep(element2))
        providerMockList.push(cloneDeep(element3))
      }
      return providerMockList
        .filter(provider =>
          (!this.filter.code || provider.code.includes(this.filter.code)) &&
          (!this.filter.name || provider.name.toUpperCase().includes(this.filter.name.toUpperCase())) &&
          (this.filter.products.length === 0 || provider.products.some(product => this.filter.products.includes(product.name))))
    }
  },
  methods: {
    search () {
      this.toastNotification('Acá habría lógica ')
    }
  }
}
</script>
