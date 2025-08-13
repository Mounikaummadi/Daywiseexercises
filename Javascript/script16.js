
const images = [
  { url: "https://picsum.photos/id/1015/600/400", caption: "Beautiful Mountain View" },
  { url: "https://picsum.photos/id/1016/600/400", caption: "Calm River Landscape" },
  { url: "https://picsum.photos/id/1018/600/400", caption: "Sunset over Hills" },
  { url: "https://picsum.photos/id/1024/600/400", caption: "Cute Puppy" }
];

let currentIndex = 0;

function showImage(index) {
  document.getElementById("gallery").src = images[index].url;
  document.getElementById("caption").textContent = images[index].caption;
}

showImage(currentIndex);

function nextImage() {
  currentIndex = (currentIndex + 1) % images.length;
  showImage(currentIndex);
}

function prevImage() {
  currentIndex = (currentIndex - 1 + images.length) % images.length;
  showImage(currentIndex);
}
