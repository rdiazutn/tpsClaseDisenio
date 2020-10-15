<template>
  <v-card
    class="mx-auto"
    outlined
  >
    <v-card-actions>
      <v-spacer />
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
    </v-card-actions>
    <v-list-item three-line>
      <v-list-item-content>
        <v-list-item-title class="headline mb-4">
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
