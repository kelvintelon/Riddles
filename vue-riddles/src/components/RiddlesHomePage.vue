<template>
  <div class="hello">
    <h1>{{ showRiddleOfTheDay }}</h1>
  </div>
</template>

<script>
export default {
  name: 'RiddlesHomePage',
  props: {
    msg: String
  },
  data() {
    return {
      riddles: [
        {
          Question: "What has to be broken before you can use it?",
          Answer: "Egg"
        },
        {
          Question: "I’m tall when I’m young, and I’m short when I’m old. What am I?",
          Answer: "Candle"
        },
        {
          Question: "What is full of holes but still holds water?",
          Answer: "Sponge"
        },
        {
          Question: "What is always in front of you but can’t be seen?",
          Answer: "Future"
        },
        {
          Question: "What can you break, even if you never pick it up or touch it?",
          Answer: "Promise"
        },
        {
          Question: "What goes up but never comes down?",
          Answer: "Age"
        },
        {
          Question: "What gets wet while drying?",
          Answer: "Towel"
        },
        {
          Question: "I shave every day, but my beard stays the same. What am I?",
          Answer: "Barber"
        },
        {
          Question: "I have branches, but no fruit, trunk or leaves. What am I?",
          Answer: "Bank"
        },
        {
          Question: "What can’t talk but will reply when spoken to?",
          Answer: "Echo"
        },
        {
          Question: "The more of this there is, the less you see. What is it?",
          Answer: "Darkness"
        },
        {
          Question: "What has many keys but can’t open a single lock?",
          Answer: "Piano"
        },
        {
          Question: "What is black when it’s clean and white when it’s dirty?",
          Answer: "Chalkboard"
        },
        {
          Question: "Where does today come before yesterday?",
          Answer: "Dictionary"
        },
        {
          Question: "What has lots of eyes, but can’t see?",
          Answer: "Potato"
        },
        {
          Question: "What has hands, but can’t clap?",
          Answer: "Clock"
        },
        {
          Question: "What has one head, one foot and four legs?",
          Answer: "Bed"
        },
        {
          Question: "What has many teeth, but can’t bite?",
          Answer: "Comb"
        },
        {
          Question: "What has words, but never speaks?",
          Answer: "Book"
        },
        {
          Question: "What can travel all around the world without leaving its corner?",
          Answer: "Stamp"
        },
        {
          Question: "What has a thumb and four fingers, but is not a hand?",
          Answer: "Glove"
        },
        {
          Question: "What has a head and a tail but no body?",
          Answer: "Coin"
        },
        {
          Question: "What building has the most stories?",
          Answer: "Library"
        },
        {
          Question: "It stalks the countryside with ears that can’t hear. What is it?",
          Answer: "Corn"
        },
        {
          Question: "If two’s company, and three’s a crowd, what are four and five?",
          Answer: "Nine"
        },
        {
          Question: "What five-letter word becomes shorter when you add two letters to it?",
          Answer: "Short"
        },
        {
          Question: "What is 3/7 chicken, 2/3 cat and 2/4 goat?",
          Answer: "Chicago"
        },
        {
          Question: "I am a word of letters three; add two and fewer there will be. What word am I?",
          Answer: "Few"
        },
        {
          Question: "What is so fragile that saying its name breaks it?",
          Answer: "Silence"
        },
        {
          Question: "What can run but never walks, has a mouth but never talks, has a head but never weeps, has a bed but never sleeps?",
          Answer: "River"
        },
        {
          Question: "What can fill a room but takes up no space?",
          Answer: "Light"
        },
        {
          Question: "The more you take, the more you leave behind. What are they?",
          Answer: "Footsteps"
        },
        {
          Question: "People make me, save me, change me, raise me. What am I?",
          Answer: "Money"
        },
        {
          Question: "What goes through cities and fields, but never moves?",
          Answer: "Road"
        },
        {
          Question: "I am always hungry and will die if not fed, but whatever I touch will soon turn red. What am I?",
          Answer: "Fire"
        },
        {
          Question: "The person who makes it has no need of it; the person who buys it has no use for it. The person who uses it can neither see nor feel it. What is it?",
          Answer: "Coffin"
        },
        {
          Question: "With pointed fangs I sit and wait; with piercing force I crunch out fate; grabbing victims, proclaiming might; physically joining with a single bite. What am I?",
          Answer: "Stapler"
        },
        {
          Question: "I have lakes with no water, mountains with no stone and cities with no buildings. What am I?",
          Answer: "Map"
        },
        {
          Question: "What does man love more than life, hate more than death or mortal strife; that which contented men desire; the poor have, the rich require; the miser spends, the spendthrift saves, and all men carry to their graves?",
          Answer: "Nothing"
        },
        {
          Question: "Spelled forwards I’m what you do every day, spelled backward I’m something you hate. What am I?",
          Answer: "Live"
        },
        {
          Question: "No matter how little or how much you use me, you change me every month. What am I?",
          Answer: "Calendar"
        },
        {
          Question: "What starts with a T, ends with a T, and has T in it?",
          Answer: "Teapot"
        },
        {
          Question: "Forwards I am heavy, backward I am not. What am I?",
          Answer: "Ton"
        },
        {
          Question: "What has ten letters and starts with gas?",
          Answer: "Automobile"
        },
        {
          Question: "What goes up and down but doesn’t move?",
          Answer: "Staircase"
        },
        {
          Question: "I’m lighter than what I am made of, and more of me is hidden than is seen. What am I?",
          Answer: "Iceberg"
        },
        {
          Question: "Walk on the living. They don’t even mumble. Walk on the dead. They mutter and grumble. What are they?",
          Answer: "Leaves"
        },
        {
          Question: "You heard me before, yet you hear me again. Then I die, ’till you call me again.",
          Answer: "Echo"
        },
        {
          Question: "What has six faces but does not wear makeup, and twenty-one eyes but cannot see?",
          Answer: "Dice"
        },
        {
          Question: "What word contains 26 letters but only has three syllables?",
          Answer: "Alphabet"
        },
        {
          Question: "You answer me, but I never ask you a question. What am I?",
          Answer: "Telephone"
        },
        {
          Question: "What is Medusa’s favorite cheese?",
          Answer: "Gorgonzola"
        },
        {
          Question: "There is nothing outside, nothing on the inside light as a feather, yet ten men cannot lift it. What is it?",
          Answer: "Bubble"
        },
        {
          Question: "I can run but not walk. The thought is not far behind me. What am I?",
          Answer: "Nose"
        },
        {
          Question: "What flowers can be found between your nose and your chin?",
          Answer: "Tulips"
        },
        {
          Question: "Washing makes it dirtier and dirtier. It is cleaner without washing at all.",
          Answer: "Water"
        },
        {
          Question: "We stand on lines; when together, it’s a crime. What are we?",
          Answer: "Crows"
        },
        {
          Question: "What is always hungry but never thirsty?",
          Answer: "Fire"
        },
        {
          Question: "Angry and hungry are both words that end in gry. The English language has three words. What is the third?",
          Answer: "Language"
        },
        {
          Question: "What begins with an “e” and only contains one letter?",
          Answer: "Envelope"
        }
      ]
    }
  },
  computed: {
    showRiddleOfTheDay() {
      let startTime = new Date("08/17/2023");
      let todayDate  = new Date();
      let todayStringMMDDYYYY = ""+(todayDate.getMonth()+1)+"/"+todayDate.getDate()+"/"+todayDate.getFullYear();
      let comparableDate = new Date(todayStringMMDDYYYY)
      let differenceInTime = comparableDate.getTime() - startTime.getTime();
      let differenceInDays = differenceInTime / (1000 * 3600 * 24);
      return this.riddles[differenceInDays].Question
    },
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>h3 {
  margin: 40px 0 0;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}</style>
