<template>
  <v-card
    class="mx-auto"
    outlined
  >
    <v-row no-gutters justify="center">
      <v-col cols="11">
        <v-card-title class="card-headline">
          Información de proveedor
        </v-card-title>
      </v-col>
      <v-spacer />
      <v-col cols="1" class="mt-4">
        <v-btn
          color="orange"
          icon
          small
          @click="cerrarDialogo"
        >
          <v-icon dark>
            mdi-close
          </v-icon>
        </v-btn>
      </v-col>
    </v-row>
    <v-divider />
    <v-list-item three-line class="px-6 my-2">
      <v-list-item-content>
        <v-list-item-title class="subheadline mb-4">
          {{ providerToInfo.name }}
        </v-list-item-title>
        <v-list-item-subtitle>{{ providerToInfo.products.map(product => product.name).join(', ') }}</v-list-item-subtitle>
      </v-list-item-content>

      <v-list-item-avatar
        size="70"
        color="grey"
      >
        <img
          src="https://cdn.vuetifyjs.com/images/john.jpg"
          alt="John"
        >
      </v-list-item-avatar>
    </v-list-item>
  </v-card>
</template>

<script>
export default {
  props: {
    providerToInfo: {
      type: Object,
      required: true
    }
  },
  methods: {
    cerrarDialogo () {
      this.$emit('closeDialog')
    }
  }
}
</script>
